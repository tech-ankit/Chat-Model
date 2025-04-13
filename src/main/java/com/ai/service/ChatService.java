package com.ai.service;


import reactor.core.publisher.Flux;

public interface ChatService {

	Flux<String> getChatResponse(String msg);
}
