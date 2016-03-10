package org.acc.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.acc.messenger.dao.DatabaseClass;
import org.acc.messenger.model.Message;
import org.acc.messenger.model.Profile;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();
	private Map<Long, Profile> profiles = DatabaseClass.getProfiles();

	// Gets all the messages
	public List<Message> getAllMessages() {

		return new ArrayList<Message>(messages.values());

	}

	public Message getMessage(long id) {

		return messages.get(id);

	}

	public Message addMessage(Message message) {

		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;

	}

	public Message updateMessage(Message message) {

		if (message.getId() <= 0) {

			return null;

		}

		messages.put(message.getId(), message);

		return message;
	}

	public Message removeMessage(long id) {

		return messages.remove(id);

	}
}
