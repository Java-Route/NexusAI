package com.nexusai.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "chat_messages")
public class ChatMessage {

    @Id
    private String id;
    private String sessionId;
    private String sender;       // "user", "assistant", "system"
    private String content;
    private String role;         // Para Spring AI: USER, ASSISTANT, SYSTEM
    private LocalDateTime timestamp = LocalDateTime.now();

    // ─── Constructors ──────────────────────────────

    public ChatMessage(String sessionId, String sender, String content, String role) {
        this.sessionId = sessionId;
        this.sender = sender;
        this.content = content;
        this.role = role;
    }

}