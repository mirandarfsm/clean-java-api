package org.exemple.usecases;

import org.exemple.models.Account;

public interface LoadAccountByToken {
    Account load(String token);
}
