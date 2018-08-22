package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Ticket;

@Repository
public interface TicketRespository extends JpaRepository<Ticket,Long> {

}
