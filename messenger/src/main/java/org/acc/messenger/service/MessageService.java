package org.acc.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.acc.messenger.dao.DatabaseClass;
import org.acc.messenger.model.Message;

public class MessageService {

	private Map<Long,Message> messages = DatabaseClass.getMessages();
	
	
	//Gets all the messages
	public List<Message> getAllMessages(){
		
		
		return new ArrayList<Message>(messages.values());
		
		
		
	}
	
	
	public Message getMessageById(long id){
		
		
		
		return null;
			
	}
}
