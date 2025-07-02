package org.example.chapter01;

public class F_Conversion {
    // main 메서드: 파일 단위의 실행을 담당하는 도구
    // - main + (ctrl + space)
    public static void main(String[] args) {
        /*
            === 자바의 형 변환 (Type Conversion) ===
            : 하나의 타입을 다른 타입으로 바꾸는 것

            표현 가능한 범위 기준에 따른 변환 규칙
            : 메모리 크기와 순서가 다를 수 있음
            byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)

            char(2)
            boolean(1)
        */

        // 1. 자동(묵시적) 형 변환
        // : 작은 자료형을 큰 자료형으로 변환 (왼쪽에서 오른쪽)
        byte smallBox = 10; // 1byte
        int bigBox = 10000; // 4byte

        bigBox = smallBox; // 재할당 - 기존의 변수에 새로운 값을 할당(삽입)

        // cf) 변수는 재할당 시 기존의 값이 새로운 값으로 '변환'

        // sout + 자동 완성
        System.out.println(bigBox); // 10

        byte a = 32;
        short b = a;
        int c = b;
        long d = c;

        float e = d; // 4byte float에 8byte long 데이터 삽입이 가능

        // char f = e; - 묵시적 형 변환 불가! (char는 2byte)

        // 2. 강제(명시적) 형 변환
        // : 큰 자료형을 작은 자료형으로 변환 (오른쪽에서 왼쪽)

        int intNumber = 1234;
        float floatNumber = intNumber;

        // 강제 형 변환
        // 작은타입 변수명 = (작은타입) 큰데이터값;
        int intNumber2 = (int)floatNumber;

        long aa = 32L; // long 타입은 데이터 뒤에 알파벳 L, l 필수!
        int bb = (int)aa;
        short cc = (short)bb;
        byte dd = (byte)cc;
    }
}
