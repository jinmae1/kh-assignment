package com.oop.emp.controller;

import java.lang.reflect.Field;

import com.oop.emp.model.dto.Employee;

/**
 * EmpArrayTest
 */
public class EmployeeManager {

    private int p = 0;
    private final int MAX_EMPLOYEE = 3;
    private Employee[] eArr = new Employee[MAX_EMPLOYEE];
    private static final Field[] empFields = Employee.class.getDeclaredFields();

    public Employee[] getEArr() {
        return this.eArr;
    }

    public void setEArr(Employee[] eArr) {
        this.eArr = eArr;
    }

    public void printEmployees() {
        // System.out.println("empNo\tName\tDept\tJob\tAge\tGender\tSalary\tBonus\tPhone\tAddress");
        System.out.println(
                "========================================================================================================================");
        System.out.printf("ear[i]\t%-8s %s\t%s\t%s\t%s\t%s\t%10s\t%s\t%-15s\t%s%n", "empNo", "Name", "Dept", "Job",
                "Age", "Gender", "Salary", "Bonus", "Phone", "Address");
        System.out.println(
                "========================================================================================================================");
        int i = 0;
        for (Employee employee : eArr) {
            System.out.println("ear[" + i++ + "]\t" + employee.empInformation());

        }
        return;
    }

    public void printAnnualSalary() {

        for (Employee employee : eArr) {
            System.out.printf("%s의 연봉:\t%d%n", employee.getEmpName(), this.getAnnualIncome(employee));

        }
        return;

    }

    public void printAnnualSalaryAvg() {

        int total = 0;

        for (Employee employee : eArr) {
            total += this.getAnnualIncome(employee);
        }

        System.out.println("직원들의 연봉의 평균: " + total / eArr.length);
        return;

    }

    private int getAnnualIncome(Employee employee) {
        int annualIncome = (int) (employee.getSalary() * (1 + employee.getBonusPoint())) * 12;
        return annualIncome;
    }

    private static String[] getEmployeeDeclaredFields() {
        String[] strEmployeeFields = new String[empFields.length];

        for (int i = 0; i < empFields.length; i++) {
            strEmployeeFields[i] = empFields[i].getName();

        }
        return strEmployeeFields;

    }

}