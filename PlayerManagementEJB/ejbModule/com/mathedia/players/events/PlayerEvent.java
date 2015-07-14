package com.mathedia.players.events;

import javax.inject.Named;

@Named
@PlayerNotification
public class PlayerEvent {

	private String message;

	public PlayerEvent(String message) {
		super();
		this.message = message;
	}
	
	public PlayerEvent() {}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}