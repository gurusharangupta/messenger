package org.acc.messenger.dao;

import java.util.HashMap;
import java.util.Map;

import org.acc.messenger.model.Message;
import org.acc.messenger.model.Profile;

public class DatabaseClass {

	
	private static Map<Long,Profile> profiles = new HashMap<>();
	private static Map<Long,Message> messages = new HashMap<>();
	
	
	
	
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	
}
