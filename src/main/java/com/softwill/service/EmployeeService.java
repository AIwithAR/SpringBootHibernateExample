package com.softwill.service;

import com.softwill.model.Employee;

import java.util.List;

public interface EmployeeService {

    public void signUp(Employee employee);
    public boolean signIn(String empEmailId, String empPassword);
    public Employee getDataByID(int empId);
    public List<Employee> getDataByName(String empName);

    public List<Employee> sortBySalary();
    public Employee getDataByContactNumber(long empContactNumber);
    public List<Employee> getAllData();
    //Update

    public void updateData(int empId, Employee employee);
    public void deleteDataById(int empId);
    public void deleteAllData();


}
