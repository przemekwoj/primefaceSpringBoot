package pl.javaleader.PrimeFacesSpringBoot2.service;

import org.springframework.stereotype.Service;
import pl.javaleader.PrimeFacesSpringBoot2.model.Employee;
import pl.javaleader.PrimeFacesSpringBoot2.repositories.EmployeeRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void removeEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }
}
