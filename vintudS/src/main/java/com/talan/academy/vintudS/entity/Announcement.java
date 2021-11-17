package com.talan.academy.vintudS.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Announcement implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int announcement_id ;
	
	private String title  ;
	private String description  ;
//	private int category_id  ;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
	
	private double price ;
	private byte[] picture ;
	private Date publication_date ; 
	private boolean is_available  ;
	private int view_number  ;
	private String localisation  ;
//	private int user_id  ;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
	
	
	
	public Announcement() {
		super();
	}
	
public Announcement(int announcement_id, String title, String description, double price, byte[] picture, Date publication_date,
		boolean is_available, int view_number, String localisation) {
	super();
	this.announcement_id = announcement_id;
	this.title = title;
	this.description = description;
	this.price = price;
	this.picture = picture;
	this.publication_date = publication_date;
	this.is_available = is_available;
	this.view_number = view_number;
	this.localisation = localisation;
}

public int getAnnouncement_id() {
	return announcement_id;
}

public void setAnnouncement_id(int announcement_id) {
	this.announcement_id = announcement_id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public byte[] getPicture() {
	return picture;
}

public void setPicture(byte[] picture) {
	this.picture = picture;
}

public Date getPublication_date() {
	return publication_date;
}

public void setPublication_date(Date publication_date) {
	this.publication_date = publication_date;
}

public boolean isIs_available() {
	return is_available;
}

public void setIs_available(boolean is_available) {
	this.is_available = is_available;
}

public int getView_number() {
	return view_number;
}

public void setView_number(int view_number) {
	this.view_number = view_number;
}

public String getLocalisation() {
	return localisation;
}

public void setLocalisation(String localisation) {
	this.localisation = localisation;
}


	
	
}
