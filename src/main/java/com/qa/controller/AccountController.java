package com.qa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.service.AccountService;
import com.qa.persistence.domain.Account;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

	@Autowired
	private AccountService accServ;

	@GetMapping("/getAll")
	public List<Account> getaccounts() {
		return accServ.getAllAccounts();
	}

	@PostMapping("/add")
	public String createaccount(@RequestBody Account account) {
		return accServ.add(account);
	}

	@GetMapping("/get/{id}")
	public Optional<Account> getAccount(@PathVariable long id) {
		return accServ.getAccount(id);
	}

}
