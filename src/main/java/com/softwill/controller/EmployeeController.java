package com.softwill.controller;


import com.softwill.model.Employee;
import com.softwill.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // VSV code madhe
@RestController  // JSON
@RequestMapping("api")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    //Save
    @PostMapping("/signup")
    public ResponseEntity<String> singUp(@RequestBody Employee employee){
        log.info("-------------------------Trying to SignUp Employee ----");
        employeeServiceImpl.signUp(employee);
        return ResponseEntity.ok("Sign up successfull");
    }
//Read
    @GetMapping("/signin/{empEmailId}/{empPassword}")
    public ResponseEntity<Boolean> signIn(@PathVariable String empEmailId, @PathVariable String empPassword){

        log.info("--------------------------Trying to sing in Employee, Name is ------------");
        return ResponseEntity.ok(employeeServiceImpl.signIn(empEmailId, empPassword));
    }

    @GetMapping("/getdatabyid/{empId}")
    public ResponseEntity<Employee> getDataById(@PathVariable int empId){
        log.info("------------------------ Getting data by Id ----------------");
        return ResponseEntity.ok(employeeServiceImpl.getDataByID(empId));
    }

    @GetMapping("/getdatabyname/{empName}")
    public ResponseEntity<List<Employee>> getDataByName(@PathVariable String empName){
        log.info("------------------------Getting data by name ---------------------");
        return ResponseEntity.ok(employeeServiceImpl.getDataByName(empName));

    }

    @GetMapping("/sortbysalary")
    public ResponseEntity<List<Employee>> sortBySalary(){
        log.info("-----------------------Sorting data by salary");
        return ResponseEntity.ok(employeeServiceImpl.sortBySalary());
    }
//put  - GET, POST, PUT, DELETE

    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<String> updateData(@PathVariable int empId, @RequestBody Employee employee){

        employeeServiceImpl.updateData(empId, employee);
        return ResponseEntity.ok("Data updated successfuly");

    }
//Delete
    @DeleteMapping("/deletedatabyid/{empId}")
    public ResponseEntity<String> deleteDataById(@PathVariable int empId){

        employeeServiceImpl.deleteDataById(empId);
        log.info("-------------------Delteing data by ID ---------------");
        return ResponseEntity.ok("Data Delted successfully");
    }

//get

    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData(){
        log.info("-------------- Getting all data ------------------------");
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }

//Delete

    @DeleteMapping("/deletealldata")
    public ResponseEntity<String> deleteAlldata(){
        employeeServiceImpl.deleteAllData();
        return ResponseEntity.ok("Data Deleted successfully");
    }

    @GetMapping("/getdatabycontactnumber/{empContactNumber}")
    public ResponseEntity<Employee> getDataByContactNumber(@PathVariable long empContactNumber){
        log.info("getting data by contact number");
        return ResponseEntity.ok(employeeServiceImpl.getDataByContactNumber(empContactNumber));
    }


}
