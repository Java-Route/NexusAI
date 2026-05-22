package com.nexusai.ai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {
    @Bean
    ChatClient chatClient(ChatModel chatModel) {
        return ChatClient.builder(chatModel)
                .defaultSystem("""
                    You are NexusAI, an intelligent technical support assistant 
                    for NexusTech Solutions. You help support agents analyze tickets,
                    answer technical questions, and provide solutions.
                    Always respond in a structured, professional manner.
                    If you don't know something, say so clearly.
                    """)
                .build();
    }
}
