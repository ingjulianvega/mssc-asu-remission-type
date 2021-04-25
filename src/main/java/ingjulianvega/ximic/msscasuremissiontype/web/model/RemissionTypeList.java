package ingjulianvega.ximic.msscasuremissiontype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RemissionTypeList implements Serializable {

    static final long serialVersionUID = -6265101289547971559L;

    public ArrayList<RemissionTypeDto> bodyPartList;
}
