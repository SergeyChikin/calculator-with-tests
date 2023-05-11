package pro.sky.calculatorwithtests.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.METHOD_FAILURE  )
public class InvalidValueException extends IllegalArgumentException {
    public InvalidValueException(String message) {
        super(message);
    }

}
