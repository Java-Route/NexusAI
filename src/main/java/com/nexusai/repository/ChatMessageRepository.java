package com.nexusai.repository;

import com.nexusai.model.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatMessageRepository extends MongoRepository<ChatMessage, String> {
    List<ChatMessage> findBySessionIdOrderByTimestampAsc(String sessionId);

    List<ChatMessage> findTop20BySessionIdOrderByTimestampDesc(String sessionId);

    void deleteBySessionId(String sessionId);

}
