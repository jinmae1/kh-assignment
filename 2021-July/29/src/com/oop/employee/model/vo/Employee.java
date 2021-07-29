package com.oop.employee.model.vo;

import java.util.Scanner;

public class Employee {

    // Fields
    private int empNo;
    private String name;
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

    public Employee(int empNo, String name, char gender, String phone) {
        this.empNo = empNo;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonusPoint) {
        this(empNo, name, gender, phone);
        this.dept = dept;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
    }

    // Methods
    public void empInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("사번: ");
        this.setEmpNo(sc.nextInt());

        System.out.print("이름: ");
        sc.nextLine();
        this.setName(sc.nextLine());

        System.out.print("소속부서: ");
        this.setDept(sc.nextLine());

        System.out.print("직급: ");
        this.setJob(sc.nextLine());

        System.out.print("나이: ");
        this.setAge(sc.nextInt());

        System.out.print("성별: ");
        this.setGender(sc.next().charAt(0));

        System.out.print("급여: ");
        this.setSalary(sc.nextInt());

        System.out.print("보너스포인트: ");
        this.setBonusPoint(sc.nextDouble());

        System.out.print("핸드폰: ");
        sc.nextLine();
        this.setPhone(sc.nextLine());

        System.out.print("주소: ");
        this.setAddress(sc.nextLine());
        System.out.println();
    }

    public void empOutput() {
        System.out.println();
        System.out.println("사번: " + this.getEmpNo());
        System.out.println("이름: " + this.getName());
        System.out.println("소속부서: " + this.getDept());
        System.out.println("직급: " + this.getJob());
        System.out.println("나이: " + this.getAge());
        System.out.println("성별: " + this.getGender());
        System.out.println("급여: " + this.getSalary());
        System.out.println("보너스포인트: " + this.getBonusPoint());
        System.out.println("핸드폰: " + this.getPhone());
        System.out.println("주소: " + this.getAddress());
        System.out.println();
    }

    // Deprecated
    public void empDelete() {
        this.setEmpNo(0);
        this.setName(null);
        this.setDept(null);
        this.setJob(null);
        this.setAge(0);
        this.setGender(' ');
        this.setSalary(0);
        this.setBonusPoint(0.0);
        this.setPhone(null);
        this.setAddress(null);
    }

    // Getters
    public int getEmpNo() {
        return this.empNo;
    }

    public String getName() {
        return this.name;
    }

    public String getDept() {
        return this.dept;
    }

    public String getJob() {
        return this.job;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public int getSalary() {
        return this.salary;
    }

    public double getBonusPoint() {
        return this.bonusPoint;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    // Setters
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printEmployee() {

        System.out.print(this.empNo + ". ");
        System.out.print(this.name + ", ");
        System.out.print(this.gender + ", ");
        System.out.print(this.phone + ", ");
        System.out.print(this.dept + ", ");
        System.out.print(this.salary + ", ");
        System.out.print(this.bonusPoint);
        System.out.println();
    }

}
