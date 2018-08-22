package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.persistence.domain.movieTime;

@Repository
public interface timeResponsity extends JpaRepository<movieTime, Long> {

}
