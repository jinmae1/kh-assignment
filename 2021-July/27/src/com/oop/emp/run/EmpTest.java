package com.oop.emp.run;

import com.oop.emp.model.Employee;
import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		EmpTest test = new EmpTest();

		int select = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			test.mainMenu();
			System.out.print("메뉴를 선택하세요: ");
			select = sc.nextInt();

			switch (select) {
				case 1:
					emp.empInput();
					break;

				case 2:
					emp.deleteEmp();
					break;

				case 3:
					emp.empOutput();
					break;

				case 9:
					return;

				default:
					System.out.println("다시 선택해주세요.");
			}
		}
	}

	public void mainMenu() {
		System.out.println("******* 사원 정보 관리 프로그램 ************");
		System.out.println("1. 새 사원 정보 입력");
		System.out.println("2. 사원 정보 삭제");
		System.out.println("3. 사원 정보 출력");
		System.out.println("9. 끝내기");
		System.out.println("********************************************");
	}

}
