package pl.javaleader.PrimeFacesSpringBoot2.controllers;

import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.stereotype.Component;
import pl.javaleader.PrimeFacesSpringBoot2.service.EmployeeService;

@Component(value = "deleteEmployeeController")
@Join(path = "/deleteEmployee", to = "/employees-list.jsf")
public class DeleteEmployeeController {

    private EmployeeService employeeService;

    public DeleteEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String deleteEmployee(long id){
        employeeService.removeEmployeeById(id);
        return "/employees-list.xhtml?faces-redirect=true";
    }
}
