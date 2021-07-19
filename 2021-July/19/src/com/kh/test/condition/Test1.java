package com.kh.test.condition;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

    public void test() {

        int you = 0;
        int com = 0;
        String rsp_you = "";
        String rsp_com = "";

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("===가위 바위 보 게임===");
        System.out.print("숫자를 선택하세요(1. 가위 / 2. 바위 / 3. 보): ");
        you = sc.nextInt();

        if (!(you == 1 || you == 2 || you == 3)) {
            System.out.println("1, 2, 3 중에 하나만 입력하세요.");
            return;
        }

        com = rnd.nextInt(3) + 1;

        if (you == 1)
            rsp_you = "가위";
        if (com == 1)
            rsp_com = "가위";
        if (you == 2)
            rsp_you = "바위";
        if (com == 2)
            rsp_com = "바위";
        if (you == 3)
            rsp_you = "보";
        if (com == 3)
            rsp_com = "보";

        System.out.println("======== 결과 ========");
        System.out.println("당신은 " + rsp_you + "를 냈습니다.");
        System.out.println("컴퓨터는 " + rsp_com + "를 냈습니다.");
        System.out.println("====================");

        if (you == com) {
            System.out.println("비겼습니다.");
            return;
        }

        if ((you == 1 && com == 2) || (you == 2 && com == 3) || (you == 3 && com == 1)) {
            System.out.println("졌습니다.");

        } else {
            System.out.println("이겼습니다.");
        }
    }
}