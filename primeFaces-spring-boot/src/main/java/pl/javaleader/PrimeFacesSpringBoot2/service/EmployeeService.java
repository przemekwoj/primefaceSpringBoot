package pl.javaleader.PrimeFacesSpringBoot2.service;

import pl.javaleader.PrimeFacesSpringBoot2.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void removeEmployeeById(long id);
}
