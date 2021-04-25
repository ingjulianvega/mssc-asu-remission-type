package ingjulianvega.ximic.msscasuremissiontype.services;

import ingjulianvega.ximic.msscasuremissiontype.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasuremissiontype.domain.RemissionTypeEntity;
import ingjulianvega.ximic.msscasuremissiontype.domain.repositories.RemissionTypeRepository;
import ingjulianvega.ximic.msscasuremissiontype.exception.RemissionTypeException;
import ingjulianvega.ximic.msscasuremissiontype.web.Mappers.RemissionTypeMapper;
import ingjulianvega.ximic.msscasuremissiontype.web.model.RemissionType;
import ingjulianvega.ximic.msscasuremissiontype.web.model.RemissionTypeDto;
import ingjulianvega.ximic.msscasuremissiontype.web.model.RemissionTypeList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class RemissionTypeServiceImpl implements RemissionTypeService {

    private final RemissionTypeRepository remissionTypeRepository;
    private final RemissionTypeMapper remissionTypeMapper;

    @Cacheable(cacheNames = "remissionTypeListCache")
    @Override
    public RemissionTypeList get() {
        log.debug("get()...");
        return RemissionTypeList
                .builder()
                .bodyPartList(remissionTypeMapper.remissionTypeEntityListToRemissionTypeDtoList(remissionTypeRepository.findAllByOrderByName()))
                .build();
    }

    @Cacheable(cacheNames = "remissionTypeCache")
    @Override
    public RemissionTypeDto getById(UUID id) {
        log.debug("getById()...");
        return remissionTypeMapper.remissionTypeEntityToRemissionTypeDto(
                remissionTypeRepository.findById(id)
                        .orElseThrow(() -> new RemissionTypeException(ErrorCodeMessages.REMISSION_TYPE_NOT_FOUND, "")));
    }

    @Override
    public void create(RemissionType remissionType) {
        log.debug("create()...");
        remissionTypeMapper.remissionTypeEntityToRemissionTypeDto(
                remissionTypeRepository.save(
                        remissionTypeMapper.remissionTypeDtoToRemissionTypeEntity(
                                RemissionTypeDto
                                        .builder()
                                        .name(remissionType.getName())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, RemissionType remissionType) {
        log.debug("updateById...");
        RemissionTypeEntity evidenceEntity = remissionTypeRepository.findById(id)
                .orElseThrow(() -> new RemissionTypeException(ErrorCodeMessages.REMISSION_TYPE_NOT_FOUND, ""));

        evidenceEntity.setName(remissionType.getName());

        remissionTypeRepository.save(evidenceEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        remissionTypeRepository.deleteById(id);
    }
}
