package ru.test.todo.todo;

public class ToDoBuilder {

    private static ToDoBuilder instance = new ToDoBuilder();

    private String id = null;
    private String desc = "";

    private ToDoBuilder(){}

    public static ToDoBuilder create(){
        return instance;
    }

    public ToDoBuilder withDesc(String desc){
        this.desc = desc;
        return instance;
    }

    public ToDoBuilder withId(String id){
        this.id = id;
        return instance;
    }

    public ToDo build(){
        ToDo result = new ToDo(this.desc);
        if (id != null){
            result.setId(id);
        }
        return result;
    }

}
