package com.example.getlistofalbums_retrofit;

import com.google.gson.annotations.SerializedName;

public class ResponceDTOItem {

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("userId")
	private int userId;

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public int getUserId(){
		return userId;
	}

	@Override
 	public String toString(){
		return 
			"ResponceDTOItemItem{" + 
			"id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",userId = '" + userId + '\'' + 
			"}";
		}
}