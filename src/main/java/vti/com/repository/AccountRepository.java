package vti.com.repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import vti.com.entity.Account;
import vti.com.utils.HibernateUtils;


import java.util.List;

@Repository
public class AccountRepository implements  IAccountRepository{

    private static HibernateUtils hibernateUtils;
    public AccountRepository (){
        hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<Account> getAllAccount() {
        Session session = null;
        try {
            session = hibernateUtils.openSession();
            Query<Account> query = session.createQuery("FROM Account");

            return query.list();
        }finally {
            if(session != null){
                hibernateUtils.closeFactory();
            }
        }
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
