package com.bobocode.hw4.function;

import com.bobocode.model.Account;

import java.util.Optional;

@FunctionalInterface
public interface AccountProvider {
    Optional<Account> getAccount();
}
