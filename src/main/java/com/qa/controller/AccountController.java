package com.qa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qa.business.service.AccountService;
import com.qa.persistence.domain.Account;
import com.qa.util.LoginDto;

@RestController
@RequestMapping(value = "/account")
@CrossOrigin(origins = "http://localhost:8080")
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

	@PutMapping("/edit/{id}")
	public String updaqteTicket(@RequestBody Account accountToUpdate, @PathVariable Long id) {
		return accServ.updateAccount(accountToUpdate, id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteTicket(@PathVariable Long id) {
		return accServ.deleteAccount(id);
	}
	
	@PostMapping("/login")
	public long login(@RequestBody LoginDto login) {
		return accServ.login(login);
	}
}
