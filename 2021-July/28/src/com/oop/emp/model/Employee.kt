package com.oop.emp.model
import java.util.*

class Employee {
    // Setters
    // Getters
    // Fields
    var empNo = 0
    var empName: String? = null
    var dept: String? = null
    var job: String? = null
    var age = 0
    var gender = 0.toChar()
    var salary = 0
    var bonusPoint = 0.0
    var phone: String? = null
    var address: String? = null

    // Methods
    fun empInput() {
        val sc = Scanner(System.`in`)
        print("사번: ")
        empNo = sc.nextInt()
        print("이름: ")
        sc.nextLine()
        empName = sc.nextLine()
        print("소속부서: ")
        dept = sc.nextLine()
        print("직급: ")
        job = sc.nextLine()
        print("나이: ")
        age = sc.nextInt()
        print("성별: ")
        gender = sc.next()[0]
        print("급여: ")
        salary = sc.nextInt()
        print("보너스포인트: ")
        bonusPoint = sc.nextDouble()
        print("핸드폰: ")
        sc.nextLine()
        phone = sc.nextLine()
        print("주소: ")
        address = sc.nextLine()
        println()
    }

    fun empOutput() {
        println()
        println("사번: " + empNo)
        println("이름: " + empName)
        println("소속부서: " + dept)
        println("직급: " + job)
        println("나이: " + age)
        println("성별: " + gender)
        println("급여: " + salary)
        println("보너스포인트: " + bonusPoint)
        println("핸드폰: " + phone)
        println("주소: " + address)
        println()
    }

    // Deprecated
    fun empDelete() {
        empNo = 0
        empName = null
        dept = null
        job = null
        age = 0
        gender = ' '
        salary = 0
        bonusPoint = 0.0
        phone = null
        address = null
    }
}