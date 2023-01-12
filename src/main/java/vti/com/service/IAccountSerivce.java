package vti.com.service;

import vti.com.entity.Account;

import java.util.List;

public interface IAccountSerivce {
    public List<Account> getAllAccount();
    public Account getAccountByID(int id);
    public Account getAccountByName(String name);
    public void createAccount(Account account);
    public void updateAccount(int id);
    public Account deleteAccount(int id);
}
