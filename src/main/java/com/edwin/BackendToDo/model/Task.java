package com.edwin.BackendToDo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int taskId;
    private int userId;
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
        return userId;
    }
    public void setId(int x) {
        this.userId = x;
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
    public Task(int id, String description, Date date, Date finishDate) {
        this.userId = id;
        this.description = description;
        this.date = date;
        this.finishDate = finishDate;
    }
    
    

}
