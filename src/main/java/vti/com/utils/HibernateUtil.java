package vti.com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import vti.com.entity.Account;
import vti.com.entity.Department;

public class HibernateUtil {
    private static SessionFactory FATORY;

    static {
        Configuration conf = new Configuration();

        conf.configure("hibernate.cfg.xml");

        conf.addAnnotatedClass(Department.class);

        conf.addAnnotatedClass(Account.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();

        FATORY = conf.buildSessionFactory(registry);
    }

    public static SessionFactory getFACTORY() {
        return FATORY;
    }
}
