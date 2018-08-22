package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.ScreenDateTime;

@Repository
public interface ScreenDateTimeRepository extends JpaRepository<ScreenDateTime, Long>{

}
