package com.talan.academy.vintudS.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Category implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int category_id ;
	
	private String name  ;
	private String description  ;
	
	public Category() {
		super();
	}

	public Category(int category_id, String name, String description) {
		super();
		this.category_id = category_id;
		this.name = name;
		this.description = description;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setId(int category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
