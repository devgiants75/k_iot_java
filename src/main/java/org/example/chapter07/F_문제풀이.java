package org.example.chapter07;

// [문제 1] (객관식)
// 다음 Java 코드에서 컴파일 오류가 발생하는 이유로 옳은 것은?
class Parent {
    final void greet() { System.out.println("Hello from Parent"); }
}

class Child extends Parent {
    // void greet() { System.out.println("Hello from Child"); }
}
// ① final 클래스는 상속이 불가능하다.
// ② final 메서드는 오버라이딩이 불가능하다.
// ③ greet 메서드는 접근제어자가 없기 때문에 접근할 수 없다.
// ④ 자식 클래스에서는 부모 생성자를 반드시 호출해야 한다.

// [문제 2] (빈칸 채우기)
// 다음 코드에서 Book 클래스의 count 변수는 모든 인스턴스가 공유해야 하므로 ______ 키워드를 붙여 선언해야 한다.
class ABook {
    // private ______ int count = 0;
}

// [문제 3] (OX문제)
// 다음 설명이 참이면 O, 거짓이면 X를 선택하시오.
// : private으로 선언된 변수는 같은 클래스 내부에서만 접근 가능하며, 상속받은 자식 클래스에서는 접근할 수 있다. (O/X)

public class F_문제풀이 {
}
