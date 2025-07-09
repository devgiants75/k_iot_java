package org.example.chapter08;

// === 인터페이스 === //
// : Fruit 과일 인터페이스 정의
// - color: 추상 메서드
// - describe: 디폴트 메서드
// - printType: 정적 메서드

interface Fruit {
    // 추상 메서드: public abstract 생략
    String color();

    // 디폴트 메서드: 재정의(오버라이딩) 가능
    default void describe() {
        System.out.println("과일의 색상은 " + color() + "입니다. / 모양은 동그랗습니다.");
    }

    // 정적 메서드: 재정의(오버라이딩) 불가능
    static void printType() {
        System.out.println("과일(Fruit) 타입입니다.");
    }
}

class Apple implements Fruit {
    public String color() { return "red"; }
}

class Orange implements Fruit {
    public String color() { return "orange"; }
}

class Banana implements Fruit {
    public String color() { return "yellow"; }

    @Override
    public void describe() {
        System.out.println("과일의 색상은 " + color() + "이며, 모양은 깁니다.");
    }
}

// 인터페이스의 상속 //
// extends 확장하다
// : 클래스 간의, 인터페이스 간의 확장

// cf) implements 구현하다: A(클래스) implements B(인터페이스)
interface TropicalFruit extends Fruit {
    // [ 생략 ]
    // - color: 추상 메서드
    // - describe: 디폴트 메서드
    // - printType: 정적 메서드

    default void tropicalFeature() {
        System.out.println("열대 과일은 후숙하면 더 맛있습니다.");
    }
}

class Mango implements TropicalFruit {
    @Override
    public String color() {
        return "yellow";
    }

    @Override
    public void describe() {
        System.out.println("과일의 색상은 " + color() + "이며, 모양은 타원형입니다.");
    }
}

public class G_Practice {
    public static void main(String[] args) {

        // 다형성 적용
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Fruit banana = new Banana();
        TropicalFruit mango = new Mango();

        // 업 캐스팅
        // : mango를 Fruit 타입으로 형 변환
        // > TropicalFruit가 Fruit를 상속받는 인터페이스
        Fruit[] fruits = { apple, orange, banana, mango };


        
    }
}
