package com.nexusai.ai.orchestration;

import com.nexusai.ai.models.SupportResponse;
import com.nexusai.ai.models.TicketAnalysis;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class OllamaAssistant implements AiAssistant {

    private final ChatClient chatClient;

    public OllamaAssistant(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public TicketAnalysis analyzeTicket(String ticketTitle, String ticketDescription) {
        // TODO: Implementa este método.
        //
        // Instrucciones:
        // 1. Usa chatClient.prompt() para iniciar la llamada.
        // 2. En .user(), construye un prompt que incluya el título y la descripción.
        //    Ejemplo: "Analyze this support ticket:\nTitle: " + ticketTitle + "\nDescription: " + ticketDescription
        // 3. Usa .call() para ejecutar la llamada.
        // 4. Usa .entity(TicketAnalysis.class) para obtener el resultado como structured output.
        // 5. Retorna el TicketAnalysis resultante.
        //
        return chatClient.prompt().user(ticketTitle).call().entity(TicketAnalysis.class);
        // Pista — La cadena completa se ve así:
        // return chatClient.prompt().user(...).call().entity(TicketAnalysis.class);

        //throw new UnsupportedOperationException("TODO: Implement analyzeTicket");
    }

    @Override
    public SupportResponse answerQuestion(String question) {
        // TODO: Implementa este método.
        //
        // Instrucciones:
        // 1. Construye un prompt claro pidiendo al LLM responder la pregunta de soporte.
        // 2. Usa .entity(SupportResponse.class) para structured output.
        // 3. Retorna el SupportResponse.
        //
        // Tip: El system prompt ya está configurado en AiConfig,
        //      así que solo necesitas el user prompt aquí.

        throw new UnsupportedOperationException("TODO: Implement answerQuestion");
    }

    @Override
    public Flux<String> streamResponse(String question) {
        // Implementaremos esto en la Fase 5 (Streaming).
        // Por ahora, deja esta implementación temporal:
        return Flux.just(chat(question));
    }

    @Override
    public String chat(String userMessage) {
        // TODO: Implementa este método.
        //
        // Este es el más simple — retorna texto plano.
        // Usa: chatClient.prompt().user(userMessage).call().content();

        throw new UnsupportedOperationException("TODO: Implement chat");
    }
}
