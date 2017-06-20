package com.example.springreactive.controller;

import com.example.springreactive.model.Account;
import com.example.springreactive.service.AccountService;
import com.example.springreactive.service.AccountServiceImplReactiveCrudRepository;
import com.example.springreactive.service.AccountServiceImplReactiveMongoRepository;
import com.example.springreactive.service.AccountServiceImplRxJavaCrudRepository;
import io.reactivex.Flowable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

/**
 * Created by Gideon Manurung on 6/19/2017.
 */
@Controller
public class AccountController {
    @Autowired
    private AccountServiceImplReactiveMongoRepository accountServiceImplReactiveMongoRepository;
    @Autowired
    private AccountServiceImplReactiveCrudRepository accountServiceImplReactiveCrudRepository;
    @Autowired
    private AccountServiceImplRxJavaCrudRepository accountServiceImplRxJavaCrudRepository;

    @GetMapping(value = "/accounts/mongo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Flux<Account> getAllAccountReactiveMongo(){
        return accountServiceImplReactiveMongoRepository.getAccounts().map(a->new Account(a.getId(),a.getName(),a.getAddress()));
    }

    @GetMapping(value = "/accounts/reactivecrud", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Flux<Account> getAllAccountReactiveCrud(){
        return accountServiceImplReactiveCrudRepository.getAccounts();
    }

    @GetMapping(value = "/accounts/rxjavacrud", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Flowable<Account> getAllAccountRxJavaCrud(){
        return accountServiceImplRxJavaCrudRepository.getAccounts();
}
}
