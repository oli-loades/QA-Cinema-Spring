package com.qa.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountRepository;
import com.qa.util.AccoutnNumberGenerator;
import com.qa.util.LoginDto;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepo;

	@Autowired
	private AccoutnNumberGenerator generator;

	public List<Account> getAllAccounts() {
		return accountRepo.findAll();
	}

	public String add(Account account) {
		boolean unique = false;
		String accNum = "";

		while (!unique) {
			accNum = generator.generate();
			if (!accountRepo.existsByAccountNunber(accNum)) {
				unique = true;
			}
		}

		account.setAccountNumber(accNum);
		accountRepo.save(account);
		return "{\"message\": \"account sucessfully added\"}";
	}

	public Optional<Account> getAccount(long id) {
		return accountRepo.findById(id);
	}

	public String updateAccount(Account AccountToUpdate, Long id) {
		Optional<Account> account = accountRepo.findById(id);
		if (account.isPresent()) {
			AccountToUpdate.setId(id);
		}
		accountRepo.save(AccountToUpdate);
		return "{\"message\": \"Account sucessfully updated\"}";
	}

	public String deleteAccount(Long id) {
		accountRepo.deleteById(id);
		return "{\"message\": \"Account sucessfully  removed\"}";
	}

	public boolean login(LoginDto login) {
		Optional<Account> account = accountRepo.findByAccountNumber(login.getAccountNumber());
		boolean auth = false;
		if (account.isPresent() && account.get().getPassword().equals(login.getPassword())) {
			auth = true;
		}
		return auth;
	}

}
