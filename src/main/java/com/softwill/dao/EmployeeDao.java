package com.softwill.dao;

import com.softwill.model.Employee;

import java.util.List;

public interface EmployeeDao {

    //Create
    public void singUp(Employee employee);
    // read
    public boolean singIn(String empEmailId, String empPassword);

    public Employee getDataById(int empId);

    public List<Employee> getDataByName(String empName);

    public List<Employee> sortBySalary();

    public Employee getDataByContactNumber(long empContactNumber);

    public List<Employee> getAllData();

    // Update

    public void updateData(int empId, Employee employee);

    // Delete

    public void deleteDataById(int empId);

    public void deleteAllData();


}
