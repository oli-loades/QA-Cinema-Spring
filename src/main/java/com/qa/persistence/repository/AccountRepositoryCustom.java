package com.qa.persistence.repository;

import java.util.Optional;

import com.qa.persistence.domain.Account;

public interface AccountRepositoryCustom {
Optional<Account> findByAccountNumber(String accNum);
Boolean existsByAccountNunber(String accNum);
}
