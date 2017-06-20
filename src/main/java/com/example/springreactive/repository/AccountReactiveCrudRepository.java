package com.example.springreactive.repository;

import com.example.springreactive.model.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Gideon Manurung on 6/20/2017.
 */
@Repository
public interface AccountReactiveCrudRepository extends ReactiveCrudRepository<Account, Integer>{
}
