package ingjulianvega.ximic.msscasuremissiontype.web.Mappers;


import ingjulianvega.ximic.msscasuremissiontype.domain.RemissionTypeEntity;
import ingjulianvega.ximic.msscasuremissiontype.web.model.RemissionTypeDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface RemissionTypeMapper {
    RemissionTypeDto remissionTypeEntityToRemissionTypeDto(RemissionTypeEntity remissionTypeEntity);

    RemissionTypeEntity remissionTypeDtoToRemissionTypeEntity(RemissionTypeDto remissionTypeDto);

    ArrayList<RemissionTypeDto> remissionTypeEntityListToRemissionTypeDtoList(List<RemissionTypeEntity> remissionTypeEntityList);
}
