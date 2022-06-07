package com.bobocode.fundamentals.hw4.function;

import com.bobocode.model.CreditAccount;

import java.util.Optional;

@FunctionalInterface
public interface CreditAccountProvider {
    Optional<CreditAccount> getAccount();
}
