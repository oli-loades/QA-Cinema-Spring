package com.qa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qa.Account;

public interface userRepository extends JpaRepository<Account, Long>{

}
