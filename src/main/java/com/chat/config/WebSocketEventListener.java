package com.chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class WebSocketEventListener {

    @EventListener
    public void HandleWebSocketDisconnectListener(SessionDisconnectEvent event) {
        
    }
}
