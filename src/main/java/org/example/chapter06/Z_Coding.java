package org.example.chapter06;

class _Parent {
    static int total = 0;
    int v = 1;

    public _Parent() {
        total += ++v; // total = 2;
        // 자식 생성자 내에서 호출 시 show() 메서드는 오버라이드 된 메서드가 호출
        show(); // total == 6
    }

    public void show() {
        total += total;
    }
}

class _Child extends _Parent {
    int v = 10;

    public _Child() {
        // 자식 생성자 내의 부모 생성자가 호출
        v += 2; // 12
        total += v++; // total == 6 + 12 (18), v == 13
        show(); // 자식 내부의 오버라이드 된 show() 호출
    }

    @Override
    public void show() {
        total += total * 2;
        // 2 + (2 * 2) == 6
        // 18 + (18 * 2) == 54
    }
}

public class Z_Coding {
    public static void main(String[] args) {
        new _Child(); // 자식 객체 생성자 호출 -> 부모 생성자 호출
        System.out.println(_Parent.total); // 54
    }
}
