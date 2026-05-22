package com.nexusai.repository;

import com.nexusai.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByStatus(Ticket.TicketStatus status);

    List<Ticket> findByPriority(Ticket.TicketPriority priority);

    List<Ticket> findByCreatedByOrderByCreatedAtDesc(String createdBy);

    long countByStatus(Ticket.TicketStatus status);
}
