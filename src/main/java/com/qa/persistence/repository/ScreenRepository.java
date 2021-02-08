package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.persistence.domain.Screens;

public interface ScreenRepository extends JpaRepository<Screens, Long>, ScreenRepositoryCustom {

}
