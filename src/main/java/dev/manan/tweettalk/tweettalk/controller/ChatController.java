package dev.manan.tweettalk.tweettalk.controller;

import dev.manan.tweettalk.tweettalk.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chatMessage") // Handles incoming messages
    @SendTo("/topic/publicChat") // Broadcasts messages to subscribers
    public ChatMessage chatMessage(ChatMessage message) {
        return message;
    }
}