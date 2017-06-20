package com.example.springreactive.service;

import com.example.springreactive.model.Account;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;

/**
 * Created by Gideon Manurung on 6/20/2017.
 */
public interface AccountServiceRxJava {
    Maybe<Account> getAccountByid(int id);
    Flowable<Account> getAccounts();
    Single<Account> saveAccount(Account account);
}
