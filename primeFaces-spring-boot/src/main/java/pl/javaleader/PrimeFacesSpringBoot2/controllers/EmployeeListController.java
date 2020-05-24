package pl.javaleader.PrimeFacesSpringBoot2.controllers;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.stereotype.Component;
import pl.javaleader.PrimeFacesSpringBoot2.model.Employee;
import pl.javaleader.PrimeFacesSpringBoot2.service.EmployeeService;

import java.util.List;


@Component(value = "employeesList")
@ELBeanName(value = "employeesList")
@Join(path = "/", to = "/employees-list.jsf")
public class EmployeeListController {


    private List<Employee> employees;

    private EmployeeService employeeService;

    public EmployeeListController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    public List<Employee> getEmployees() {
        employees = employeeService.getAllEmployees();
        return employees;
    }
}
