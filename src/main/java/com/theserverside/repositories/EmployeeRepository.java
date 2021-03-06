package com.theserverside.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.theserverside.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}