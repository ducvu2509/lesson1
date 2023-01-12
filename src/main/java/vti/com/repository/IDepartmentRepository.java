package vti.com.repository;

import vti.com.entity.Account;
import vti.com.entity.Department;

import java.util.List;

public interface IDepartmentRepository {
    public List<Department> getAllDepartments();
    public List<Department> getDepartmentByID(int id);
    public Department getDepartmentByName(String name);
    public void createDepartment(Department department);
    public void deleteDepartment(int id);

}
