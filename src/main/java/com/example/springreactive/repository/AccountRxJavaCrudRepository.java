package com.example.springreactive.repository;

import com.example.springreactive.model.Account;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Gideon Manurung on 6/20/2017.
 */
@Repository
public interface AccountRxJavaCrudRepository extends RxJava2CrudRepository<Account,Integer> {
}
