package org.example.chapter03;

// == 자바 정적 배열 == //
// 장점) 기본 데이터 타입 사용 가능 - int, char, boolean 등
//          , 요소 접근 속도가 빠름 (인덱스 기반)
// 단점)
//  : 한 번 생성되면 크기 변경 X
//  : 크기 변경이 필요한 경우, 변경된 크기의 배열을 생성하여 요소값을 복사 (alt + shift + 방향키)

import java.util.Arrays;

public class E_Array {
    public static void main(String[] args) {
        // 자바 정적 배열
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]

        // == 자바 동적 배열 (ArrayList) == //
        // : Java의 동적 배열 구현체
        // - 크기 제한 없이 동적으로 요소 추가/삭제 가능
        // - Java Collection Framework의 일부: 'java.util.ArrayList'에서 제공

    }
}
