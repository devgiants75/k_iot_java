package org.example.정보처리기사_실기_2025_2;

// 상속 + 오버라이딩
// static 메서드
public class Java03 {
    public static class Parent {
        public int x(int i) { return i + 2; }
        // cf) static 메서드의 오버라이딩
        //      : 정적 메서드는 오버라이딩 되지 않고, 참조 변수의 타입 기준으로 호출
        public static String id() { return "P"; }
    }

    public static class Child extends Parent {
        public int x(int i) { return i + 3; }
        public String x(String s) { return s + "R"; }
        public static String id() { return "C"; }
    }

    public static void main(String[] args) {
        Parent ref = new Child(); // ref 인스턴스 - 업캐스팅(Parent 타입이지만 실제 인스턴스는 Child)

        // ref.x(2) == 5, ref의 타입은 Parent(업캐스팅) - 부모의 Parent.id() 호출 == P
        // 5P
        System.out.println(ref.x(2) + ref.id());

        // 인스턴스 메서드는 동적 바인딩 - 실제 객체의 행위를 동작
        // 정적 메서드는 정적 바인딩 - 참조 인스턴스의 타입이 가진 행위를 동작
    }
}
