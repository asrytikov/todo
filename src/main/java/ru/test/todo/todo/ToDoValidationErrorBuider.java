package ru.test.todo.todo;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

public class ToDoValidationErrorBuider {

    public static ToDoValidationError fromBindingErrors(Errors errors){
        ToDoValidationError error = new ToDoValidationError("Validation failed, "+ errors.getErrorCount() + " error(s)");
        for (ObjectError objectError : errors.getAllErrors()){
            error.addValidationError(objectError.getDefaultMessage());
        }
        return error;
    }

}
