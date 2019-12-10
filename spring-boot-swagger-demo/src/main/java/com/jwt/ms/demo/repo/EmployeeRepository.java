package com.jwt.ms.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.ms.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
