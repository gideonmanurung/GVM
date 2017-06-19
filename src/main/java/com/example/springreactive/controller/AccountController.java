package com.example.springreactive.controller;

import com.example.springreactive.model.Account;
import com.example.springreactive.service.AccountService;
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
    private AccountService aService;

    @GetMapping(value = "/accounts", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Flux<Account> getAllAccount(){
        return aService.getAccounts();
    }
}
