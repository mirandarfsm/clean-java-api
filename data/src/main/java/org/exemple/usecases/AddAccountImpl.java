package org.exemple.usecases;

import org.exemple.models.Account;
import org.exemple.protocols.db.AddAccountRepository;

public class AddAccountImpl implements AddAccount {

    private AddAccountRepository addAccountRepository;

    public AddAccountImpl(AddAccountRepository addAccountRepository) {
        this.addAccountRepository = addAccountRepository;

    }

    public Account add(Account account) {
        return this.addAccountRepository.add(account);
    }

}
