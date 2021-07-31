package ingjulianvega.ximic.msscasuremissiontype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RemissionType implements Serializable {

    static final long serialVersionUID = -235993884904618181L;

    @NotBlank
    private String name;

}
