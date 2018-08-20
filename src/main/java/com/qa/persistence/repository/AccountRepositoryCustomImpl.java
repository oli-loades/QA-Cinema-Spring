package com.qa.persistence.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.persistence.domain.Account;

public class AccountRepositoryCustomImpl implements AccountRepositoryCustom {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Optional<Account> findByAccountNumber(String accNum) {
		Query query = entityManager.createNativeQuery("SELECT * FROM account WHERE account_number='" + accNum + "'",
				Account.class);
		Optional<Account> account;
		if (query.getResultList().isEmpty()) {
			account = Optional.empty();
		} else {
			account = Optional.of((Account) query.getSingleResult());
		}
		return account;
	}

	@Override
	public Boolean existsByAccountNunber(String accNum) {
		Optional<Account> account = findByAccountNumber(accNum);
		boolean exists = false;
		if (account.isPresent()) {
			exists = true;
		}
		return exists;
	}

}
