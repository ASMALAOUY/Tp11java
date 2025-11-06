package com.exemple.tp;


public class Task {
	private static int counter =0;
	private final int id ;
	private String description;
	private int priority;
	private Status status;
	public Task(String description, int priority) {
		super();
		this.id=++counter;
		this.description = description;
		this.priority = priority;
		this.status = Status.PENDING;
				
	}
	public String getDescription() {
		return description;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	@Override 
	public String toString() {
		return String.format("[%d](prio=%d) %s - %s",
				id,priority,status,description);
			
		
	}
	
	 
	
	

}
