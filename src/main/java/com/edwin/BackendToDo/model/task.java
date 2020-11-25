package com.edwin.BackendToDo.model;

import java.util.Date;

public class task {
    private int id;
    private String description;
    private boolean isComplete;
    private Date date;
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public void setId(int x) {
        this.id = x;
    }
    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    public boolean getComplete() {
        return isComplete;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public task(int id, String description) {
        this.id = id;
        this.description = description;
    }


}
