package com.qa;
import org.springframework.data.jpa.repository.JpaRepository;
import  com.qa.Ticket;

public interface TiicketResponisity extends JpaRepository<Ticket,Long> {

}
