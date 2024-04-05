package com.hacaton.hacaton_05_04_2024.repository;

import com.hacaton.hacaton_05_04_2024.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
