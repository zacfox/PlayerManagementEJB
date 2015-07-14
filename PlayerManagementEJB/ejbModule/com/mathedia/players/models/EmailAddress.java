package com.mathedia.players.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true) //jackson Annotation, damit unbekannte Felder im JSON ignoriert werden
public class EmailAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//Identity kann verwendet werden, weil mit mySQL Datenbank gearbeitet wird
	private int id;
	private String emailAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setStreet(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
