package vti.com.service;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vti.com.entity.Department;
import vti.com.repository.IDepartmentRepository;

import java.util.List;
@Service
public class DepartmentService implements  IDepartmentService{
    @Autowired
    private IDepartmentRepository repository;

    @Override
    public List<Department> getAllDepartments() {

        return repository.getAllDepartments();
    }

    @Override
    public List<Department> getDepartmentByID(int id) {
        return repository.getDepartmentByID(id);
    }

    @Override
    public Department getDepartmentByName(String name) {
        return repository.getDepartmentByName(name);
    }

    @Override
    public void createDepartment(Department department) {
        repository.createDepartment(department);
    }

    @Override
    public void deleteDepartment(int id) {
        repository.deleteDepartment(id);
    }

}
