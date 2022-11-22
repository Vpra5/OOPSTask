package com.axis.service

import com.axis.model.Employee

//in service call we  write the business logic
class EmployeeService {

    //this method is used to display employee details
    //it takes employee objects are param
    //it returns unit

    fun displayEmployeeDetails(employee: Employee) {
        println("====employee info===")
        println("id= ${employee.id}")
        println("name = ${employee.name}")
        println("salary = ${employee.salary}")
    }

    fun perDaySalary(employee: Employee): Int {
        return employee.salary / 30
    }

    fun incrementSalaryByTenPercentage(employee: Employee): Double {
        var incrementedSalary: Double = employee.salary * 0.10
        println("10 % salary is $incrementedSalary")
        return incrementedSalary + employee.salary
    }
}