package com.ai.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/api/v1/chat")
public class ChatRestController {
	
	@Autowired
	private ChatService chatService;
	
	@GetMapping
	public Flux<String> getChatResponse(@RequestParam String msg) {
		return chatService.getChatResponse(msg);
	}

}
