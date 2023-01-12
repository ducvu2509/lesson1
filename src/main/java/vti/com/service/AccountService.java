package vti.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vti.com.entity.Account;
import vti.com.repository.IAccountRepository;

import java.util.List;

@Service
public class AccountService implements  IAccountSerivce{
    @Autowired
    private IAccountRepository repository;

    @Override
    public List<Account> getAllAccount() {
        return repository.getAllAccount();
    }

    @Override
    public Account getAccountByID(int id) {
        return null;
    }

    @Override
    public Account getAccountByName(String name) {
        return null;
    }

    @Override
    public void createAccount(Account account) {

    }

    @Override
    public void updateAccount(int id) {

    }

    @Override
    public Account deleteAccount(int id) {
        return null;
    }
}
