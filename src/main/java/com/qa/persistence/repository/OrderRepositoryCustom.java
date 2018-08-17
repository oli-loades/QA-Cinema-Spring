package com.qa.persistence.repository;

import java.util.List;

import com.qa.persistence.domain.OrderFilm;

public interface OrderRepositoryCustom {
List<OrderFilm> getAllByAccount(long id);
}
