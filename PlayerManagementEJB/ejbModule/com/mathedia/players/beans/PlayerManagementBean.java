package com.mathedia.players.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mathedia.players.dto.BasePlayerData;
import com.mathedia.players.events.PlayerEvent;
import com.mathedia.players.events.PlayerNotification;
import com.mathedia.players.models.Player;


/**
 * In dieser Bean sind die CRUD Operationen abgebildet.
 * 
 * @author tobi
 *
 */
@Stateless
public class PlayerManagementBean {
	
	@PersistenceContext
	private EntityManager em;	//Der EM wird über die Annotation injiziert, damit kann auf die Datenbank zugegriffen werden
	
	@PlayerNotification
	@Inject
	private Event<PlayerEvent> event;
	
	public List<BasePlayerData> getAllPlayers() {
		return em.createQuery(
			"SELECT new com.mathedia.players.dto.BasePlayerData(" +
					"p.id, p.nickname) FROM Player p",
					BasePlayerData.class).getResultList();
	}
	
	public List<Player> getAllPlayersFull() {
		return em.createQuery("SELECT p FROM Player p", Player.class).getResultList();
	}
	
	public Player getPlayer(int playerId) {
		return em.find(Player.class, playerId);
	}

	public Player createPlayer(Player player) {
		em.persist(player);
		event.fire(new PlayerEvent("Spieler angelegt!"));
		
		return player;
	}
	
	public Player updatePlayer(Player player) {
		Player result = em.merge(player);
		event.fire(new PlayerEvent("Spieler bearbeitet!"));
		
		return result;
	}
	
	public void deletePlayer(int playerId) {
		em.remove(getPlayer(playerId));
		event.fire(new PlayerEvent("Spieler entfernt!"));
	}
}
