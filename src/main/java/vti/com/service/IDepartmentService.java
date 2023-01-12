package vti.com.service;

import vti.com.entity.Department;

import java.util.List;

public interface IDepartmentService {
    public List<Department> getAllDepartments();
    public List<Department> getDepartmentByID(int id);
    public Department getDepartmentByName(String name);
    public void createDepartment(Department department);
    public void deleteDepartment(int id);
}
