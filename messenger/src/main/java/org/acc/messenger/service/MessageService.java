package org.acc.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.acc.messenger.dao.DatabaseClass;
import org.acc.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		
		messages.put(1L, new Message(1L, "Hello World", "Gurusharan"));
		messages.put(2L, new Message(2L, "Pursuit of Happyness", "Rajat"));
		
		
		
	}

	// Gets all the messages
	public List<Message> getAllMessages() {

		return new ArrayList<Message>(messages.values());

	}

	public Message getMessageById(long id) {

		return null;

	}
}
