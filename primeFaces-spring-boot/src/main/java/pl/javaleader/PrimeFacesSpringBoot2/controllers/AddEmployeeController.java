package pl.javaleader.PrimeFacesSpringBoot2.controllers;

import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.stereotype.Component;
import pl.javaleader.PrimeFacesSpringBoot2.model.Employee;
import pl.javaleader.PrimeFacesSpringBoot2.service.EmployeeService;


@Component(value = "addEmployeeController")
@Join(path = "/addEmployee", to = "/addEmployee-form.jsf")
public class AddEmployeeController {
    private Employee newEmployee;

    private EmployeeService employeeService;

    public AddEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.newEmployee = new Employee();
    }

    public String save() {
        employeeService.addEmployee(newEmployee);
        newEmployee = new Employee();
        return "/employees-list.xhtml?faces-redirect=true";
    }

    public Employee getNewEmployee() {
        return newEmployee;
    }

}
