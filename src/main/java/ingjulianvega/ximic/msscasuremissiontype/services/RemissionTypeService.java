package ingjulianvega.ximic.msscasuremissiontype.services;


import ingjulianvega.ximic.msscasuremissiontype.web.model.RemissionType;
import ingjulianvega.ximic.msscasuremissiontype.web.model.RemissionTypeDto;
import ingjulianvega.ximic.msscasuremissiontype.web.model.RemissionTypeList;

import java.util.UUID;

public interface RemissionTypeService {
    RemissionTypeList get(Boolean usingCache);

    RemissionTypeDto getById(UUID id);

    void create(RemissionType remissionType);

    void updateById(UUID id, RemissionType remissionType);

    void deleteById(UUID id);
}
