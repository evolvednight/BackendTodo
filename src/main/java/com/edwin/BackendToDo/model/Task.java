package com.edwin.BackendToDo.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Task {
    private int id;
    private String description;
    private boolean isComplete;
    private Date date;
    private Date finishDate;
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
    
    public Date getFinishDate() {
    	return finishDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Task(int id, String description, Date date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }
    
    

}