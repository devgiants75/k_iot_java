package org.example.chapter06;

// == 상속에서의 생성자 == //
// : 상속받은 클래스에서 생성자 호출
// >> (순서) 부모에서 자식 순서로 호출!

// cf) 자식 클래스에서 객체 생성 시, 자식 클래스는 해당 클래스의 생성자를 통해 객체 생성
//      - 자식 클래스의 생성자 호출 시 '반드시' 부모 클래스의 생성자가 호출(사용자 정의일 필요 X)
//      - 반드시 부모가 존재해야 만! 자식이 존재!

class A {
    A() {} // 빈 생성자 - 사용자 정의 생성자가 없으면 기본 생략!
    A(int a) {
        // System.out.println(a);
        this(); // 'this()' 호출은 생성자 본문의 첫 번째 구문이어야 합니다 - 최상단!
        System.out.println(a);
    }
}

class Mammal {
    String name = "Parent";

    // Mammal() {}

    Mammal() {
        System.out.println("빈 부모 생성자 - 인스턴스 생성");
    }

    Mammal(String name) {
        this.name = name;
    }

    void displayMammal() {
        System.out.println(name);
    }
}

// class Animal {}

class Cat extends Mammal {
    String name = "Child";

    // cf) 상속받은 자식 클래스의 경우
    //      : 사용자 정의 부모 생성자의 호출이 없더라도!
    //      - super() 부모 클래스 생성자 호출 키워드가 정의되어 있음! (생략)

    Cat() {
        super(); // 생략되어 있어도 자동 호출
        // >> Mammal 클래스 내에 매개변수가 없는 생성자
    }

    Cat(String name) {
        super(name);
        // super() 메서드는 부모 클래스의 생성자를 가져오는 키워드
        // - 부모 클래스 내에 정의된 생성자를 형태 그대로 사용
        // - 여러 개의 생성자가 있는 경우 (오버로딩) super()의 형태도 다양할 수 있음
    }
}

public class C_Inheritance {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); // 빈 부모 생성자 - 인스턴스 생성
    }
}
