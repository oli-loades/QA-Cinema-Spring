package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.persistence.domain.Ticket;

public interface TiicketRespository extends JpaRepository<Ticket,Long> {

}
