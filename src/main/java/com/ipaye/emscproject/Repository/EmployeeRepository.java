package com.ipaye.emscproject.Repository;

import com.ipaye.emscproject.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Object> findEmployeeById(Long id);
}
