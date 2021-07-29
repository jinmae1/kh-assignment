package com.oop.employee.controller;

import com.oop.employee.model.vo.Employee;

public class Run {

    public static void main(String[] args) {

        Employee[] emp = new Employee[3];

        emp[0] = new Employee();
        emp[1] = new Employee(1, "홍길동", '남', "010-1234-5678");
        emp[2] = new Employee(2, "유관순", '여', "010-3131-3131", "영업부", 3_000_000, 0.15);

        for (Employee e : emp) {
            e.printEmployee();
        }
    }
}