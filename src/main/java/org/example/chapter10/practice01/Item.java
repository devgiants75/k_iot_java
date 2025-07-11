package org.example.chapter10.practice01;

// 시스템의 제품이 가져야 할 기본 속성과 메서드
abstract class Item {
    private final String id; // 제품 고유 번호
    private final String name; // 제품명

    // 생성자로 final 데이터 값 주입
    public Item(String id, String name) {
        // 해당 클래스의 구현체가 생성될 때
        //  인자값으로 초기화 - final 오류 제거
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    public abstract void display(); // 추상 메서드
}
