package com.oop.emp.run
import com.oop.emp.model.*
import java.util.*

class EmpTest {
    fun mainMenu() {
        var select = 0
        var emp: Employee? = null
        val sc = Scanner(System.`in`)
        while (true) {
            printMainMenu()
            print("메뉴를 선택하세요: ")
            select = sc.nextInt()
            when (select) {
                1 -> {
                    emp = Employee()
                    emp.empInput()
                    pressEnter()
                }
                2 -> {
                    if (emp != null) modifyMenu(emp) else println("등록된 사원이 없습니다.")
                    pressEnter()
                }
                3 -> {
                    if (emp != null) emp = null else println("등록된 사원이 없습니다.")
                    pressEnter()
                }
                4 -> {
                    if (emp != null) emp.empOutput() else println("등록된 사원이 없습니다.")
                    pressEnter()
                }
                9 -> return
                else -> {
                    println("다시 선택해주세요.")
                    pressEnter()
                }
            }
        }
    }

    fun modifyMenu(e: Employee) {
        var select = 0
        val sc = Scanner(System.`in`)
        while (true) {
            printModifyMenu()
            print("부메뉴를 선택하세요: ")
            select = sc.nextInt()
            sc.nextLine()
            when (select) {
                1 -> {
                    print("변경할 이름을 입력하세요: ")
                    e.empName =sc.nextLine()
                    pressEnter()
                }
                2 -> {
                    print("변경할 급여를 입력하세요: ")
                    e.salary = sc.nextInt()
                    sc.nextLine()
                    pressEnter()
                }
                3 -> {
                    print("변경할 부서를 입력하세요: ")
                    e.dept = sc.nextLine()
                    pressEnter()
                }
                4 -> {
                    print("변경할 직급을 입력하세요: ")
                    e.job = sc.nextLine()
                    pressEnter()
                }
                5 -> {
                    println("이전 메뉴로 이동합니다.")
                    return
                }
                else -> {
                    println("다시 선택해주세요.")
                    pressEnter()
                }
            }
        }
    }

    fun printMainMenu() {
        clearScreen()
        println("******* 사원 정보 관리 프로그램 ************")
        println("1. 새 사원 정보 입력")
        println("2. 사원 정보 수정")
        println("3. 사원 정보 삭제")
        println("4. 사원 정보 출력")
        println("9. 끝내기")
        println("********************************************")
    }

    fun printModifyMenu() {
        clearScreen()
        println("********** 사원 정보 수정 메뉴 **********")
        println("1. 이름 변경")
        println("2. 급여 변경")
        println("3. 부서 변경")
        println("4. 직급 변경")
        println("5. 이젠 메뉴로 이동")
        println("********************************************")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val test = EmpTest()
            test.mainMenu()
        }

        fun pressEnter() {
            val sc = Scanner(System.`in`)
            do {
                print("엔터를 누르세요: ")
            } while (sc.nextLine() === "\n")
            clearScreen()
            return
        }

        fun clearScreen() {
            print("\u001b[H\u001b[2J")
            System.out.flush()
        }
    }
}