package com.ai.service.impl;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.mistralai.MistralAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.service.ChatService;

import reactor.core.publisher.Flux;

@Service
public class ChatServiceImpl implements ChatService{
	
	@Autowired
	private ChatModel model;

	@Override
	public Flux<String> getChatResponse(String msg) {
		return model.stream(msg);
	}

}
