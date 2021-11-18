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
public class Favoris implements Serializable{
	
	private Date dateAjout;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int favoris_id;
	//private int annonce_id;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "announcement_id")
    private Announcement announcement;
	
	//private int user_id;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
	
	
	public Favoris() {
		super();
	}
	public Favoris(Date dateAjout, int favoris_id) {
		super();
		this.dateAjout = dateAjout;
		this.favoris_id = favoris_id;
	}
	public Date getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}
	public int getFavoris_id() {
		return favoris_id;
	}
	public void setFavoris_id(int favoris_id) {
		this.favoris_id = favoris_id;
	}
	
	
	

}
