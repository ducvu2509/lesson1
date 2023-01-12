package vti.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vti.com.entity.Department;
import vti.com.service.IDepartmentService;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/departments")
public class DepartmentController {
    @Autowired
    private IDepartmentService service;

    @GetMapping()
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }

    @GetMapping(value = "/{id}")
    public List<Department> getDepartmentByID(@PathVariable (name = "id") int id){

        return service.getDepartmentByID(id);
    };

    @GetMapping(value = "/name/{name}")
    public Department getDepartmentByName(@PathVariable (name = "name") String name) {
        return service.getDepartmentByName(name);
    }

    @PostMapping()
    public void createDepartment (@RequestBody Department department){
        service.createDepartment(department);
    }


    @DeleteMapping(value = "/{id}")
    public void deleteDepartment(@PathVariable (name = "id") int id) {
        service.deleteDepartment(id);
    }
}
