package org.example.chapter08;

// === 인터페이스(interface) === //
// : 객체가 어떤 방식으로 동작해야 하는지 정의하는 추상 타입
// - 객체의 동작을 약속하는 규칙!

// 1. 인터페이스 구성
// : 추상 메서드와 상수로만 구성된 특수한 클래스
// - 모든 메서드는 추상 메서드: public abstract 특성을 가짐
// - 모든 필드는 상수: public static final 특성을 가짐

// cf) >> (프로그램 전반의) 규칙(규약)
//        : 실제 구현은 인터페이스를 구현한 클래스에서 담당

// cf) 필수 키워드 생략 가능 (부분 생략도 가능)

// 2. 인터페이스 특징
// : 다중 구현을 지원 - 한 클래스에서 여러 인터페이스를 동시에 구현 가능
// : 객체의 행동을 정의하는 역할

// 3. 인터페이스 구현 방법
// : interface 키워드를 사용 (인터페이스명은 클래스명 지정과 동일: UpperCamelCase)
// - interface 인터페이스명 {}

interface PlayingCard {
    // cf) 멤버: 필드 + 메서드
    // EX) 인터페이스의 멤버, 클래스의 멤버

    // 1. 필드 (멤버 변수): 상수 선언
    // : public static final 특성을 가짐 (생략 가능)
    public static final int SPADE = 4;
    public static int DIAMOND = 3;
    public final int HEART = 2;
    int CLOVER = 1;

    // 2. 메서드: 추상 메서드
    // : public abstract 특성을 가짐 (생략 가능)
    public abstract String getCardNumber();
    String getCardKind();

    // 3. 디폴트 메서드
    // : 인터페이스에서 새로운 기능을 추가하면서 기존 구현을 포함
    // >> 기본 구현이 있는 메서드, 오버라이딩(재정의) 가능
    default void defaultMethod() {
        // default 반환타입 메서드명() {}
        System.out.println("디폴트 메서드입니다.");
    }

//    void defaultMethod2() {
//        System.out.println("default 키워드 생략 불가");
//        // 인터페이스 추상 메서드는 본문을 가질 수 없습니다
//    }

    // 4. 정적(static) 메서드
    // : 인터페이스에서 직접 구현
    // >> 인터페이스명으로 직접 호출, 오버라이딩 불가능! (객체 인스턴스 없이 사용)
    // >> 인터페이스와 관련된 공통 동작(유틸리티) 메서드를 제공하기 위해 사용
    static void staticMethod() {
        System.out.println("정적 메서드입니다.");
    }
}

// cf) 추상 클래스는 확장한다. (extends)

// interface 구현 방법
// class 클래스명 implements 인터페이스명 {}
class Card implements PlayingCard {

    private String cardNumber;
    private String cardKind;

    Card (String cardNumber, String cardKind) {
        this.cardNumber = cardNumber;
        this.cardKind = cardKind;
    }

    // cf) 인터페이스 안의 추상 메서드를 구현한 클래스 메서드는 public 지정
    @Override
    public String getCardKind() {
        return cardKind;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    // 디폴트 메서드: 재정의 가능
    // 정적 메서드: 재정의 불가!

    @Override
    public void defaultMethod() {
        System.out.println("Card 클래스에서 재정의 된 디폴트 메서드");
    }
}

public class B_Interface {
    public static void main(String[] args) {
        Card card = new Card("7", "HEART");

        System.out.println(card.getCardKind()); // HEART
        System.out.println(card.getCardNumber()); // 7

        card.defaultMethod(); // Card 클래스에서 재정의 된 디폴트 메서드

        // card.staticMethod(); // static 메서드는 해당 메서드에 포함된 인터페이스상에서만 호출 가능

        PlayingCard.staticMethod(); // 정적 메서드입니다.

        // 인터페이스 필드(상수) 사용
        System.out.println(PlayingCard.CLOVER); // 1
        System.out.println(PlayingCard.HEART); // 2
        System.out.println(PlayingCard.DIAMOND); // 3
        System.out.println(PlayingCard.SPADE); // 4
    }
}