package pl.javaleader.PrimeFacesSpringBoot2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javaleader.PrimeFacesSpringBoot2.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
