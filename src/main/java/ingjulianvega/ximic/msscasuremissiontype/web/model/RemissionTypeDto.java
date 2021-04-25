package ingjulianvega.ximic.msscasuremissiontype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RemissionTypeDto implements Serializable {

    static final long serialVersionUID = -3973299224462180336L;

    private UUID id;
    private String name;

}
