package ingjulianvega.ximic.msscasuremissiontype.web.controller;


import ingjulianvega.ximic.msscasuremissiontype.services.RemissionTypeService;
import ingjulianvega.ximic.msscasuremissiontype.web.model.RemissionType;
import ingjulianvega.ximic.msscasuremissiontype.web.model.RemissionTypeDto;
import ingjulianvega.ximic.msscasuremissiontype.web.model.RemissionTypeList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class RemissionTypeController implements RemissionTypeI {

    private final RemissionTypeService remissionTypeService;

    @Override
    public ResponseEntity<RemissionTypeList> get(Boolean usingCache) {
        return new ResponseEntity<>(remissionTypeService.get(usingCache), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RemissionTypeDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(remissionTypeService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid RemissionType remissionType) {
        remissionTypeService.create(remissionType);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid RemissionType remissionType) {
        remissionTypeService.updateById(id, remissionType);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        remissionTypeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
