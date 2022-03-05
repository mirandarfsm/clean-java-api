package org.exemple.protocols.db;

import org.exemple.models.Account;

public interface LoadAccountByTokenRepository {
    Account load(String token);
}
