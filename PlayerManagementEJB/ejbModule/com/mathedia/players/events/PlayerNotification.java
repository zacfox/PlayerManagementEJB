package com.mathedia.players.events;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * CDI Event wird von der EJB Schicht in die Web Schicht geworfen
 * 
 * @author tobi
 *
 */
@Retention(RetentionPolicy.RUNTIME) //Ist zur Laufzeit sichtbar
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE }) //Hierauf kann die Annotation angewendet werden
@Qualifier //Ist CDI Qualifier
public @interface PlayerNotification {

}