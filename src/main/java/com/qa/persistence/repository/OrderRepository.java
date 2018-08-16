package com.qa.persistence.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.persistence.domain.OrderFilm;
public interface OrderRepository  extends JpaRepository<OrderFilm,Long> {

}
