package com.nexusai.ai.orchestration;

import com.nexusai.ai.models.SupportResponse;
import com.nexusai.ai.models.TicketAnalysis;
import reactor.core.publisher.Flux;

public interface AiAssistant {

    /**
     * Analyze a support ticket and return structured analysis.
     */
    TicketAnalysis analyzeTicket(String ticketTitle, String ticketDescription);

    /**
     * Generate a support response for a user question.
     */
    SupportResponse answerQuestion(String question);

    /**
     * Stream a response token-by-token (for chat UI).
     */
    Flux<String> streamResponse(String question);

    /**
     * Simple chat — returns plain text response.
     */
    String chat(String userMessage);
}