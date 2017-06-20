package com.example.springreactive.service;

import com.example.springreactive.model.Account;
import com.example.springreactive.repository.AccountReactiveCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Gideon Manurung on 6/20/2017.
 */
@Service
public class AccountServiceImplReactiveCrudRepository implements AccountService{
    @Autowired
    private AccountReactiveCrudRepository accountReactiveCrudRepository;

    @Override
    public Mono<Account> getAccountById(int id) {
        return accountReactiveCrudRepository.findById(id);
    }

    @Override
    public Flux<Account> getAccounts() {
        return accountReactiveCrudRepository.findAll();
    }

    @Override
    public Mono<Account> saveAccount(Account account) {
        return accountReactiveCrudRepository.save(account);
    }
}
