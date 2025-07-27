package com.softwill.service;

import com.softwill.dao.EmployeeDao;
import com.softwill.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDaoImpl;
    @Override
    public void signUp(Employee employee) {
        employeeDaoImpl.singUp(employee);
    }

    @Override
    public boolean signIn(String empEmailId, String empPassword) {

        return employeeDaoImpl.singIn(empEmailId,empPassword);
    }

    @Override
    public Employee getDataByID(int empId) {
        return employeeDaoImpl.getDataById(empId);
    }

    @Override
    public List<Employee> getDataByName(String empName) {
        return employeeDaoImpl.getDataByName(empName);
    }

    @Override
    public List<Employee> sortBySalary() {
        return employeeDaoImpl.sortBySalary();
    }

    @Override
    public Employee getDataByContactNumber(long empContactNumber) {
        return employeeDaoImpl.getDataByContactNumber(empContactNumber);
    }

    @Override
    public List<Employee> getAllData() {
        return employeeDaoImpl.getAllData();
    }

    @Override
    public void updateData(int empId, Employee employee) {

            employeeDaoImpl.updateData(empId,employee);
    }

    @Override
    public void deleteDataById(int empId) {

        employeeDaoImpl.deleteDataById(empId);

    }

    @Override
    public void deleteAllData() {

        employeeDaoImpl.deleteAllData();

    }
}
