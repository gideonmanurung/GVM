package com.example.springreactive.service;

import com.example.springreactive.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Gideon Manurung on 6/19/2017.
 */
public interface AccountService {
    Mono<Account> getAccountById(int id);
    Flux<Account> getAccounts();
    Mono<Account> saveAccount(Account account);
}
