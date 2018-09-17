package com.daos;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDAO {
Boolean addEmployee(Employee emp);

boolean updateEmployee(int empID,Employee emp);
Employee findEmployeebyID(int  empID);
List<Employee> findAllEmployees();
List<Employee> findAllEmployee(double salary);
Employee removeEmployee(int empID);


}
