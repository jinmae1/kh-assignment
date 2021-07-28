package com.oop.emp.run;

import com.oop.emp.model.Employee;
import java.util.Scanner;

public class EmpTest {

    public static void main(String[] args) {

        EmpTest test = new EmpTest();
        test.mainMenu();
    }

    public void mainMenu() {

        int select = 0;
        Employee emp = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            this.printMainMenu();
            System.out.print("메뉴를 선택하세요: ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    emp = new Employee();
                    emp.empInput();
                    pressEnter();
                    break;

                case 2:
                    if (emp != null)
                        this.modifyMenu(emp);
                    else
                        System.out.println("등록된 사원이 없습니다.");
                    pressEnter();
                    break;

                case 3:
                    if (emp != null)
                        emp = null;
                    else
                        System.out.println("등록된 사원이 없습니다.");
                    pressEnter();
                    break;

                case 4:
                    if (emp != null)
                        emp.empOutput();
                    else
                        System.out.println("등록된 사원이 없습니다.");
                    pressEnter();
                    break;

                case 9:
                    return;

                default:
                    System.out.println("다시 선택해주세요.");
                    pressEnter();
            }
        }
    }

    public void modifyMenu(Employee e) {

        int select = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            this.printModifyMenu();
            System.out.print("부메뉴를 선택하세요: ");
            select = sc.nextInt();
            sc.nextLine();

            switch (select) {
                case 1:
                    System.out.print("변경할 이름을 입력하세요: ");
                    e.setEmpName(sc.nextLine());
                    pressEnter();
                    break;

                case 2:
                    System.out.print("변경할 급여를 입력하세요: ");
                    e.setSalary(sc.nextInt());
                    sc.nextLine();
                    pressEnter();
                    break;

                case 3:
                    System.out.print("변경할 부서를 입력하세요: ");
                    e.setDept(sc.nextLine());
                    pressEnter();
                    break;

                case 4:
                    System.out.print("변경할 직급을 입력하세요: ");
                    e.setJob(sc.nextLine());
                    pressEnter();
                    break;

                case 5:
                    System.out.println("이전 메뉴로 이동합니다.");
                    return;

                default:
                    System.out.println("다시 선택해주세요.");
                    pressEnter();
            }
        }
    }

    public void printMainMenu() {
        clearScreen();
        System.out.println("******* 사원 정보 관리 프로그램 ************");
        System.out.println("1. 새 사원 정보 입력");
        System.out.println("2. 사원 정보 수정");
        System.out.println("3. 사원 정보 삭제");
        System.out.println("4. 사원 정보 출력");
        System.out.println("9. 끝내기");
        System.out.println("********************************************");
    }

    public void printModifyMenu() {
        clearScreen();
        System.out.println("********** 사원 정보 수정 메뉴 **********");
        System.out.println("1. 이름 변경");
        System.out.println("2. 급여 변경");
        System.out.println("3. 부서 변경");
        System.out.println("4. 직급 변경");
        System.out.println("5. 이젠 메뉴로 이동");
        System.out.println("********************************************");
    }

    public static void pressEnter() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("엔터를 누르세요: ");

        } while (sc.nextLine() == "\n");
        clearScreen();

        return;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
