package com.example.springreactive.repository;

import com.example.springreactive.model.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Gideon Manurung on 6/19/2017.
 */
@Repository
public interface AccountRepository extends ReactiveMongoRepository<Account, Integer>{
}
