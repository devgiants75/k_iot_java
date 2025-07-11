package org.example.chapter10;

/*
    === Set 인터페이스 ===
    : 중복 X, 순서 X
    - 중복된 요소를 포함하지 않는 객체의 집합
    - 객체가 저장 순서를 가지지 않음 (삽입된 순서 유지 X)
    - null 요소 포함 가능

    cf) List: 중복 O, 순서 O, null 요소 포함 가능

    == 종류 ==
    1. HashSet
        : 가장 많이 사용되는 Set 구현체
        - 빠른 데이터 접근, 삽입 지원
        - 정렬 또는 순서 보장 X

    2. LinkedHashSet
        : HashSet + 순서 O (HashSet의 기능 확장 형태)
        - 중복 X, 순서 O

    3. TreeSet
        : 데이터가 자동 정렬, 중복 제거 + 정렬된 순서 유지가 필요한 경우
        - 중복 X, 순서 O
*/

import java.util.HashSet;
import java.util.Set;

public class D_Set {
    public static void main(String[] args) {
        // == Set 컬렉션의 주요 메서드 == //
        // add(), remove(), contains(), size(), isEmpty()

        Set<String> students = new HashSet<>();

        students.add("정지훈");
        students.add("정은혜");
        students.add("최광섭");
        students.add("손태경");

        System.out.println(students); // [최광섭, 손태경, 정지훈, 정은혜]

        students.add("정은혜");
        System.out.println(students); // [최광섭, 손태경, 정지훈, 정은혜]

        boolean result = students.remove("최광섭"); // 제거 후 완료 여부 반환
        System.out.println(result); // true
        System.out.println(students); // [손태경, 정지훈, 정은혜]

        boolean falseResult = students.remove("이승아");
        System.out.println(falseResult); // false

        System.out.println(students.size()); // 3

        System.out.println(students.contains("손태경")); // true
        System.out.println(students.contains("정지훈")); // true
        System.out.println(students.contains("조승범")); // false

        System.out.println(students.isEmpty()); // false
        students.clear();
        System.out.println(students.isEmpty()); // true
    }
}
