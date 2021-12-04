package ru.test.todo.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoValidationError {

    private List<String> errors = new ArrayList<>();
    private final String errMsg;

    public ToDoValidationError(String errMsg) {
        this.errMsg = errMsg;
    }

    public void addValidationError(String error){
        errors.add(error);
    }

    public List<String> getErrors(){
        return errors;
    }

    public String getErrMsg(){
        return errMsg;
    }

}
