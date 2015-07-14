package com.mathedia.players.dto;


/**
 * Data Transfer Object, das Daten aus der Datenbank auf eine Größe runterbricht,
 * die der Client verarbeiten kann.
 * Weniger Daten müssen vom Server zum Client transportiert werden, Client kann
 * die Daten schneller anzeigen.
 * Hat nur die Basisdaten eines Spielers, ID und nickname.
 * 
 * @author tobi
 *
 */
public class BasePlayerData {
	
	public BasePlayerData() { }
	
	public BasePlayerData(int id, String nickname) {
		this.id = id;
		this.nickname = nickname;
	}

	private int id;
	private String nickname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
