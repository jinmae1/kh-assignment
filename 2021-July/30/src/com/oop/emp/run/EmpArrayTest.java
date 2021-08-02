package com.oop.emp.run;

import com.oop.emp.controller.EmployeeManager;
import com.oop.emp.model.dto.Employee;

/**
 * EmpArrayTest
 */
public class EmpArrayTest {

	// private final int MAX_EMPLOYEE = 3;
	public static void main(String[] args) {
		// EmpArrayTest test = new EmpArrayTest();
		// test.
		EmployeeManager manager = new EmployeeManager();
		// Employee[] ear = new Employee[3];
		Employee[] ear = manager.getEArr();

		ear[0] = new Employee();
		ear[1] = new Employee(201503, "박길동", 29, 'M', "010-1234-5678", "경기도 의정부시");
		ear[2] = new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4_500_000, 0.15, "010-2143-9876", "서울시 노원구 노원동 123");

		// manager.setEArr(ear);

		manager.printEmployees();
		System.out.println();

		ear[0].setEmpNo(201305);
		ear[0].setEmpName("이영희");
		ear[0].setDept("총무부");
		ear[0].setJob("대리");
		ear[0].setAge(28);
		ear[0].setGender('F');
		ear[0].setSalary(3_750_000);
		ear[0].setBonusPoint(0.1);
		ear[0].setPhone("010-9512-7534");
		ear[0].setAddress("경기도 동두천");

		ear[1].setEmpNo(201503);
		ear[1].setDept("기획부");
		ear[1].setJob("사원");
		ear[1].setGender('M');
		ear[1].setSalary(2_900_000);
		ear[1].setBonusPoint(0.05);
		ear[1].setPhone("010-1234-5678");
		ear[1].setAddress("경기도 의정부시");

		manager.printEmployees();
		System.out.println();
		manager.printAnnualSalary();
		System.out.println();
		manager.printAnnualSalaryAvg();

	}

}