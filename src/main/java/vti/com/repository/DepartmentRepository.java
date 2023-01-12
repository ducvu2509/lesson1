package vti.com.repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import vti.com.entity.Department;
import vti.com.utils.HibernateUtil;
import vti.com.utils.HibernateUtils;

import java.util.List;

@Repository
public class DepartmentRepository implements IDepartmentRepository {

    private HibernateUtils hibernateUtils;

    public DepartmentRepository() {
        hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<Department> getAllDepartments() {
        Session session = null;
        try {
            session = hibernateUtils.openSession();

            Query<Department> query = session.createQuery("FROM Department");

            return query.list();
        } finally {
            if (session != null) {
                session.close();
            }

        }
    }

    @Override
    public List<Department> getDepartmentByID(int id) {
        Session session = null;

        try {
            // get session
            session = hibernateUtils.openSession();

            System.out.println("DEBUGggggg"+session.get(Department.class, id));

//           Department department = (Department) session.get(Department.class, id);

           Query query = session.createQuery("FROM Department d Where d.id = 2");

            return query.list();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Department getDepartmentByName(String name) {
        Session session = null;

        try {
            session = hibernateUtils.openSession();
//            department = session.get(Department.class, name);
            Query<Department> query = session.createQuery("FROM Department WHERE name = :nameParameter");

            // set parameter
            query.setParameter("nameParameter", name);

            // get result
            Department department = query.uniqueResult();

            return department;

        } finally {
            if (session != null) {
                hibernateUtils.closeFactory();
            }
        }
    }

    @Override
    public void createDepartment(Department department) {
        Session session = null;
        try {
            session = hibernateUtils.openSession();
            session.beginTransaction();

            session.save(department);

            session.getTransaction().commit();

        } finally {
            if (session != null) {
                hibernateUtils.closeFactory();
            }
        }
    }

    @Override
    public void deleteDepartment(int id) {
        Session session = null;
        try {
            session = hibernateUtils.openSession();

            Department department = session.get(Department.class, id);

            session.getTransaction().begin();

            session.delete(department);

            session.getTransaction().commit();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
