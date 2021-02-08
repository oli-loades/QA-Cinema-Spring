package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.persistence.domain.ScreenTime;

@Repository
public interface ScreenTimeRespository extends JpaRepository<ScreenTime, Long> {

}
