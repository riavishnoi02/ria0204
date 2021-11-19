package com.todo.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Tasks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_id")
	private int id;
	
	@Column(name = "task_name")
	private String taskName;
	
	@Column(name = "task_target_date")
	private Date taskTargetDate;
	
	@Column(name = "task_status")
	private String taskStatus;
	

	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tasks(int id, String taskName, Date taskTargetDate, String taskStatus) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskTargetDate = taskTargetDate;
		this.taskStatus = taskStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getTaskTargetDate() {
		return taskTargetDate;
	}

	public void setTaskTargetDate(Date taskTargetDate) {
		this.taskTargetDate = taskTargetDate;
	}
	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	@Override
	public String toString() {
		return "Tasks [id=" + id + ", taskName=" + taskName + ", taskTargetDate=" + taskTargetDate +", taskStatus=" + taskStatus + "]";
	}
	
}
