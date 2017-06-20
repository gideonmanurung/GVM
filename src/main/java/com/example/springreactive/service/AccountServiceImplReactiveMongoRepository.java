package com.example.springreactive.service;

import com.example.springreactive.model.Account;
import com.example.springreactive.repository.AccountReactiveMongoRepository;
import com.example.springreactive.repository.AccountRxJavaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Gideon Manurung on 6/19/2017.
 */
@Service
public class AccountServiceImplReactiveMongoRepository implements AccountService{
    @Autowired
    private AccountReactiveMongoRepository accountReactiveMongoRepository;

    @Override
    public Mono<Account> getAccountById(int id) {
        return accountReactiveMongoRepository.findById(id);
    }

    @Override
    public Flux<Account> getAccounts() {
        return accountReactiveMongoRepository.findAll();
    }

    @Override
    public Mono<Account> saveAccount(Account account) {
        return accountReactiveMongoRepository.save(account);
    }
}
