package com.mathedia.players.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Konfiguriert den RESTful Service.
 * 
 * @author tobi
 *
 */
@ApplicationPath("/api/v1") //Der gesamte Pfad gehört zum RESTful Service
public class PlayerManagementConfig extends Application{

}
