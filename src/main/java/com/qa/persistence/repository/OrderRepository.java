package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.persistence.domain.OrderFilm;

@Repository
public interface OrderRepository  extends JpaRepository<OrderFilm,Long>, OrderRepositoryCustom{

}
