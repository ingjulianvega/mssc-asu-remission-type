package ingjulianvega.ximic.msscasuremissiontype.exception;

import lombok.Getter;

@Getter
public class RemissionTypeException extends RuntimeException {

    private final String code;

    public RemissionTypeException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

