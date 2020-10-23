package com.minibean.timewizard.model.dto;

import java.util.Date;

public class DailyDto {
	
	private int todo_no;
	private String user_id;
	private String todo_title;
	private String todo_color;
	private String todo_content;
	private String todo_catagory;
	private String todo_hashtag;
	private Date todo_regdate;
	private String todo_complete;
	
	public DailyDto() {}

	public DailyDto(int todo_no, String user_id, String todo_title, String todo_color, String todo_content,
			String todo_catagory, String todo_hashtag, Date todo_regdate, String todo_complete) {
		this.todo_no = todo_no;
		this.user_id = user_id;
		this.todo_title = todo_title;
		this.todo_color = todo_color;
		this.todo_content = todo_content;
		this.todo_catagory = todo_catagory;
		this.todo_hashtag = todo_hashtag;
		this.todo_regdate = todo_regdate;
		this.todo_complete = todo_complete;
	}

	public int getTodo_no() {
		return todo_no;
	}

	public void setTodo_no(int todo_no) {
		this.todo_no = todo_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getTodo_title() {
		return todo_title;
	}

	public void setTodo_title(String todo_title) {
		this.todo_title = todo_title;
	}

	public String getTodo_color() {
		return todo_color;
	}

	public void setTodo_color(String todo_color) {
		this.todo_color = todo_color;
	}

	public String getTodo_content() {
		return todo_content;
	}

	public void setTodo_content(String todo_content) {
		this.todo_content = todo_content;
	}

	public String getTodo_catagory() {
		return todo_catagory;
	}

	public void setTodo_catagory(String todo_catagory) {
		this.todo_catagory = todo_catagory;
	}

	public String getTodo_hashtag() {
		return todo_hashtag;
	}

	public void setTodo_hashtag(String todo_hashtag) {
		this.todo_hashtag = todo_hashtag;
	}

	public Date getTodo_regdate() {
		return todo_regdate;
	}

	public void setTodo_regdate(Date todo_regdate) {
		this.todo_regdate = todo_regdate;
	}

	public String getTodo_complete() {
		return todo_complete;
	}

	public void setTodo_complete(String todo_complete) {
		this.todo_complete = todo_complete;
	}
	
	

}
