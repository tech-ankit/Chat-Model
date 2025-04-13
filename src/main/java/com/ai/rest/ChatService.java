package com.ai.rest;


import reactor.core.publisher.Flux;

public interface ChatService {

	Flux<String> getChatResponse(String msg);
}
