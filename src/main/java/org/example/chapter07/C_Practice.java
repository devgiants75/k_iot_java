package org.example.chapter07;

// 접근 제어자 확장
// : protected 접근제어자로 선언된 메서드를 자식 클래스에서 오버라이딩(재정의)
// >> 접근제어자 수정이 가능한지 여부!
// >> 접근제어자는 같거나 더 넓게만 가능!

import org.example.otherPackage.OtherClass;

class PracticeParent {
    protected void greet() {
        System.out.println("Hello Parent");
    }
}

class PracticeChild extends PracticeParent {
    // 오버라이딩 단축키: ctrl + o

//    @Override
//    protected void greet() {
//        super.greet();
//    }

    // 재정의한 메서드는 부모가 가진 메서드의 범위를 축소시킬 수 없음
    @Override
    public void greet() { // protected >> public 가능
        super.greet();
    }

//    @Override
//    private void greet() { >> 기존의 접근제어자보다 축소될 수 없음!!
//        super.greet();
//    }
}

// OtherClass 내부에 protected 필드와 메서드를 포함
public class C_Practice extends OtherClass {
    // String otherField;
    // void otherMethod() {}

    void exampleMethod() {
        // 자식 클래스 안에서 직접적인 접근만 가능!!
        // this.필드명; (this 생략 가능)
        System.out.println(otherField);
        System.out.println(this.otherField);
        otherMethod();
    }

    public static void main(String[] args) {
        OtherClass otherClass = new OtherClass(); // 부모 클래스의 인스턴스 생성
//        otherClass.otherField;
//        otherClass.otherMethod(); - protected 제한자!
    }
}
