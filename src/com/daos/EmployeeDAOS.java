package com.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.connections.MyConnections;
import com.pojo.Employee;

public class EmployeeDAOS implements EmployeeDAO {

	@Override
	public Boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		int rowsAdded = 0;
		String ADDEMP = "Insert into book values(?,?,?,?,?)";
		try {
			Connection con = MyConnections.openConnection();

			PreparedStatement ps = con.prepareStatement(ADDEMP);
			ps.setInt(1, emp.getEmpID());
			ps.setString(2, emp.getEmpName());
			ps.setInt(3, emp.getAge());
			ps.setDouble(4, emp.getSalary());
			ps.setDate(5, emp.getJoiningDate());
			rowsAdded = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return (rowsAdded>0);
	
	}

	@Override
	public boolean updateEmployee(int empID, Employee emp) {
		// TODO Auto-generated method stub
		boolean isUpdated = false;
		String UPDATE_EMP = "update emp salary=? where empID=?";
		try (Connection con = MyConnections.openConnection();) {
			PreparedStatement ps = con.prepareStatement(UPDATE_EMP);
			ps.setDouble(1, emp.getSalary();
			ps.setInt(2, empID);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				isUpdated = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return isUpdated;
		return 0;
	}

	@Override
	public Employee findEmployeebyID(int empID) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllEmployee(double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee removeEmployee(int empID) {
		// TODO Auto-generated method stub
		return null;
	}

}
