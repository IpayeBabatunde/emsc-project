package com.ipaye.emscproject.Controller;

import com.ipaye.emscproject.Model.Employee;
import com.ipaye.emscproject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> findAllEmployeeById(@PathVariable("id") Long id){
        Employee employee = employeeService.findEmployeesById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee){
        employee.setId(id);
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
