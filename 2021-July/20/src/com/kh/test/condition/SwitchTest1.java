package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {
    public static void main(String[] args) {
        SwitchTest1 test = new SwitchTest1();
        test.test();
    }

    public void test() {

        int fee = 0;
        int amount = 0;
        int usage = 0;
        float rate;
        float total;
        Scanner sc = new Scanner(System.in);

        int select = 0;
        String strUsage = "";

        System.out.println("-------- menu ---------");
        System.out.println("1. 가정용 (50원 / liter)");
        System.out.println("2. 상업용 (45원 / liter)");
        System.out.println("3. 공업용 (30원 / liter)");
        System.out.println("------------------------");

        System.out.print("메뉴번호를 선택하세요. ==> ");

        select = sc.nextInt();
        switch (select) {
            case 1:
                strUsage = "가정용";
                usage = 50;
                break;

            case 2:
                strUsage = "상업용";
                usage = 45;
                break;

            case 3:
                strUsage = "공업용";
                usage = 30;
                break;

            default:
                System.out.println("메뉴번호는 1, 2, 3만 가능합니다.");
                return;
        }

        System.out.print("물 사용량을 입력하세요. ==> ");
        amount = sc.nextInt();
        fee = usage * amount;
        rate = fee * 0.05f;
        total = fee + rate;

        System.out.println("\n-----------<<수도세>>------------");
        System.out.println("선택 메뉴번호: " + select + ". " + strUsage + "를 선택하셨습니다.");
        System.out.println("사용요금: " + usage * amount + "원");
        System.out.println("수도세: " + (int) rate);
        System.out.println("총 수도요금: " + (int) total + "원");

    }
}
