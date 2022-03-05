package org.exemple.usecases;

import org.exemple.models.Account;
import org.exemple.protocols.db.LoadAccountByTokenRepository;

public class LoadAccountByTokenImpl implements LoadAccountByToken {
    
    private final LoadAccountByTokenRepository loadAccountByTokenRepository;

    public LoadAccountByTokenImpl(LoadAccountByTokenRepository loadAccountByTokenRepository) {
        this.loadAccountByTokenRepository = loadAccountByTokenRepository;
    }
    
    public Account load(String token) {
        return this.loadAccountByTokenRepository.load(token);
    }
}
