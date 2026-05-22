package com.nexusai.ai.models;

import java.util.List;

public record TicketAnalysis(
        String priority,          // "LOW", "MEDIUM", "HIGH", "CRITICAL"
        String category,          // "Infrastructure", "Software", "Network", etc.
        String summary,           // One-line summary of the issue
        List<String> suggestedActions, // Recommended steps to resolve
        String estimatedTime,     // "30 minutes", "2 hours", etc.
        double confidenceScore    // 0.0 to 1.0 — how confident the AI is
) {}