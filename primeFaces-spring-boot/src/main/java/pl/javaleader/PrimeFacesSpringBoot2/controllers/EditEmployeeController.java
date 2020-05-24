package pl.javaleader.PrimeFacesSpringBoot2.controllers;

import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.stereotype.Component;
import pl.javaleader.PrimeFacesSpringBoot2.model.Employee;
import pl.javaleader.PrimeFacesSpringBoot2.service.EmployeeService;

@Component(value = "editEmployeeController")
@Join(path = "/editEmployee", to = "/editEmployee-form.jsf")
public class EditEmployeeController {
    private Employee editEmployee;

    private EmployeeService employeeService;

    public EditEmployeeController(EmployeeService employeeService) {
        editEmployee = new Employee();
        this.employeeService = employeeService;
    }

    public Employee getEditEmployee() {
        return editEmployee;
    }

    public String edit(Employee employee) {
        editEmployee = employee;
        return "/editEmployee-form.xhtml?faces-redirect=true";
    }

    public String update() {
        employeeService.updateEmployee(editEmployee);
        return "/employees-list.xhtml?faces-redirect=true";
    }

}
