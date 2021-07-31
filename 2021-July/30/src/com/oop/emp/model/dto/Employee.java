package com.oop.emp.model.dto;

/**
 * Employee
 */
public class Employee {

    private int empNo;
    private String empName;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String phone;
    private String address;

    public Employee() {

    }

    public Employee(int empNo, String empName, int age, char gender, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
            double bonusPoint, String phone, String address) {
        this(empNo, empName, age, gender, phone, address);
        this.dept = dept;
        this.job = job;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
    }

    public int getEmpNo() {
        return this.empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonusPoint() {
        return this.bonusPoint;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String empInformation() {

        return String.format("%-8d %s\t%s\t%s\t%d\t%s\t%10d\t%.1f\t%-15s\t%s", this.empNo, this.empName, this.dept,
                this.job, this.age, this.gender, this.salary, this.bonusPoint, this.phone, this.address);
    }

}