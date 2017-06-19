package com.example.springreactive.service;

import com.example.springreactive.model.Account;
import com.example.springreactive.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Gideon Manurung on 6/19/2017.
 */
@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepository aRepository;

    @Override
    public Mono<Account> getAccountById(int id) {
        return aRepository.findById(id);
    }

    @Override
    public Flux<Account> getAccounts() {
        return aRepository.findAll();
    }

    @Override
    public Mono<Account> saveAccount(Account account) {
        return aRepository.save(account);
    }
}
