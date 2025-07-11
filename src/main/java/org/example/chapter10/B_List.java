package org.example.chapter10;

// === List 인터페이스 === //
// List<User> userList = new ArrayList<>();

// 1. 특징
// : 순서 유지(인덱스를 통해 정확한 위치 지정 가능), 중복 저장 가능
// - 저장된 순서에 따라 데이터를 관리하는 다양한 메서드를 지원

// 2. 종류

// 1) ArrayList
// : 내부에서 배열을 사용한 요소 저장
// - 빠른 읽기 성능 / 느린 삽입, 삭제 성능
// - 빠른 조회 기능에 적합, 삽입과 삭제 시 데이터 이동이 필요하여 상대적으로 성능 저하

// EX) '사과 바구니' - 사과를 일렬로 정렬 정리
//      - 추가/제거: 공간에 대한 정리 (중간 삽입 시 나머지 요소를 한 칸씩 이동) >> 시간 복잡도가 발생
//      - 꺼내기(조회): 순차적인 수를 사용하여 꺼냄 (메모리 상의 위치로 바로 이동 가능) >> 속도 빠름

// 2) LinkedList
// : 내부에서 이중 연결 리스트를 사용한 요소 저장
// - 빠른 삽입, 삭제 성능 / 느린 읽기 성능
// - 연결 기반 데이터 관리: 비순차적 데이터 작업에 적합, 특정 요소 접근 시 순차 탐색이 필요하여 성능 저하

// EX) '기차' - 칸마다 서로 연결 정리
//      - 새로운 칸(객차) 추가/삭제: 앞뒤 칸에 연결만 하면 가능 >> 속도 빠름
//      - 특정 칸을 찾기: 앞에서부터 순차 탐색 >> 속도 느림

import java.util.ArrayList;

public class B_List {
    public static void main(String[] args) {
        // == List 인터페이스 주요 메서드 == //
        System.out.println("=== ArrayList ===");

        // List 인터페이스 >> AbstractList 추상 클래스 >> ArrayList 클래스
        ArrayList<String> arrayList = new ArrayList<>();

        // 데이터 추가
        arrayList.add("Java"); // 리스트 마지막 요소 저장
        arrayList.add(0, "Python"); // 원하는 위치에 저장
        arrayList.add("JavaScript");

        System.out.println(arrayList); // [Python, Java, JavaScript]

        // 데이터 읽기(반환)
        String firstElement = arrayList.get(0); // 인덱스 번호 요소 반환
        System.out.println(firstElement); // Python

        // 데이터 수정
        arrayList.set(2, "TypeScript");
        System.out.println(arrayList); // [Python, Java, TypeScript]

        // 데이터 삭제
        // : 해당 인덱스 요소를 삭제 후 '반환'
        String removedElement = arrayList.remove(1);
        System.out.println(removedElement); // Java
        System.out.println(arrayList); // [Python, TypeScript]
    }
}
