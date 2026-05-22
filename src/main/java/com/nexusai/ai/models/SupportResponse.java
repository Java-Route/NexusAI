package com.nexusai.ai.models;

import java.util.List;

public record SupportResponse(
        String answer,            // The main response text
        String tone,              // "technical", "friendly", "urgent"
        List<String> relatedTopics, // Topics the user might also need
        boolean needsEscalation   // Whether to escalate to a human
) {}