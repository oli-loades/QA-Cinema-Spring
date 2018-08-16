package com.qa.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountRepository;

@Component
public class AccountService {
	@Autowired
	private AccountRepository accountRepo;

	public List<Account> getAllAccounts() {
		return accountRepo.findAll();
	}
	
	public String add(Account account) {
		accountRepo.save(account);
		return "{\"message\": \"account sucessfully added\"}";
	}
	
	public Optional<Account> getAccount(long id) {
		return accountRepo.findById(id);
	}

}
