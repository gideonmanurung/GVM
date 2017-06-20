package com.example.springreactive.service;

import com.example.springreactive.model.Account;
import com.example.springreactive.repository.AccountRxJavaCrudRepository;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Gideon Manurung on 6/20/2017.
 */
@Service
public class AccountServiceImplRxJavaCrudRepository implements AccountServiceRxJava {
    @Autowired
    private AccountRxJavaCrudRepository accountRxJavaCrudRepository;

    @Override
    public Maybe<Account> getAccountByid(int id) {
        return accountRxJavaCrudRepository.findById(id);
    }

    @Override
    public Flowable<Account> getAccounts() {
        return accountRxJavaCrudRepository.findAll();
    }

    @Override
    public Single<Account> saveAccount(Account account) {
        return accountRxJavaCrudRepository.save(account);
    }
}
