package com.qa.persistence.repository;

import com.qa.persistence.domain.OrderTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTicketRepository extends JpaRepository<OrderTicket, Long> {
}
