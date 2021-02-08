package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.qa.persistence.domain.Seats;

public interface SeatRepository extends JpaRepository<Seats, Long> {

}
