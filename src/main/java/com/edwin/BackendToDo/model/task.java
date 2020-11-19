package com.edwin.BackendToDo.model;

public class task {
    private int id;
    private String description;

    public int getId() {
        return id;
    }
    public void setId(int x) {
        this.id = x;
    }

    public String getDescription() {
        return description;
    }

    public task(int id, String description) {
        this.id = id;
        this.description = description;
    }
}
