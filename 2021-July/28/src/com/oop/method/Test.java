package com.oop.method;

/**
 * Test
 */
public class Test {
    int a = 100;
    static int s = 99;

    public static void main(String[] args) {
        Test t = new Test();
        t.test1();
        // 100 ==> Test형 t 선언 후 자신의 test1() 메소드 호출, this는 곧 t 자신. this.a == t.a == 100;
        // 99 ==> Test.s는 static을 뜻하므로 99

        t.test2();
        // 100 ==> main의 t와 test2의 t는 이름만 같고 서로 다른 객체를 참조한다. test2의 t의 a값이 100에서 1000으로
        // 변화
        // 정작 출력하는 a는 main의 t(==this)의 a값인 100이다. 즉 test1의 첫 번째 println()과 똑같은 질문이다.
        Test t3 = new Test();
        t.test3(t3);
        // 10 ==> 인자 t3을 t라는 매개변수로 전달, t3.a = 10; this는 역시나 main의 t를 뜻한다. t3.a의 값을 물으므로
        // 10
        System.out.println(t3.a);
        // 10 ==> 윗 라인에서 t3.a의 값이 10이었으므로 똑같이 10이다.
        t.test4(t);
        // 1000 ==> test4에 t스스로를 전달, 이름도 똑같이 t다. t.a == this.a 이므로 1000
    }

    public void test1() {
        int a = 1000;
        int s = 999;
        // a, s는 그냥 지역 변수라서 아무런 영향이 없다.
        System.out.println(this.a);
        System.out.println(Test.s);
    }

    public void test2() {
        Test t = new Test();
        t.a = 1000;
        System.out.println(a);
    }

    public void test3(Test t) {
        t.a = 10;
        this.a = 200;
        System.out.println(t.a);
    }

    public void test4(Test t) {
        t.a = 1000;
        System.out.println(this.a);
    }
}