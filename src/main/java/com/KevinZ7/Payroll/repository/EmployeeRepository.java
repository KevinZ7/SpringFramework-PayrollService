package com.KevinZ7.Payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KevinZ7.Payroll.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}