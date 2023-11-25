package com.SpringProjects.EmployeeCRUD.repo;

import com.SpringProjects.EmployeeCRUD.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
