package vti.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vti.com.entity.Account;
import vti.com.service.IAccountSerivce;

import java.util.List;

@Controller
@RequestMapping(value = "api/v1/accounts")
public class AccountController {
    @Autowired
    private IAccountSerivce service;

    @GetMapping()
    public List<Account> getAllAccount(){

        return service.getAllAccount();
    }

    public Account getAccountByID(int id){
        return null;
    }
    public Account getAccountByName(String name){
        return null;
    }
    public void createAccount(Account account){

    };
    public void updateAccount(int id){

    }
    public Account deleteAccount(int id){
        return null;
    }
}
