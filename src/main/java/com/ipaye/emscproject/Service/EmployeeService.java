package com.ipaye.emscproject.Service;

import com.ipaye.emscproject.Exception.EmployeeNotFoundException;
import com.ipaye.emscproject.Model.Employee;
import com.ipaye.emscproject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee findEmployeesById(Long id) {
        return (Employee) employeeRepository.findEmployeeById(id)
                .orElseThrow(() -> new EmployeeNotFoundException
                        ("Employee by id " + id + " does not exist "));
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        Employee existingEmployee = this.employeeRepository
                .findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee bt id " +id+ " was not found"));
        this.employeeRepository.delete(existingEmployee);
    }
}
