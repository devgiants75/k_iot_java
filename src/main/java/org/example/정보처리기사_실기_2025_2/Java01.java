package org.example.정보처리기사_실기_2025_2;

public class Java01 {
    public static void change(String[] data, String s) {
        // cf) 메서드의 인자값과 매개변수
        //      : 인자값은 값의 복사 방식으로 매개변수에 전달
        //      - 인자값과 매개변수의 주소값이 다름

        // +) 배열의 참조는 메서드 끼리 공유됨
        // +) 문자열의 참조는 실질적인 값의 복사형식으로 전달됨

        data[0] = s; // data 배열의 첫 번째 인덱스 번호에 B값이 할당
        s = "Z"; // 지역 변수 - 해당 메서드를 벗어나면 값이 유지되지 않음
    }

    public static void main(String[] args) {
        String data[] = { "A" }; // data 배열에 선언과 동시에 초기화 - data[0] = "A";
        String s = "B";

        // data 배열과 s 문자열이 인자로 전달

        change(data, s); // data[0] == B, s == B
        System.out.println(data[0] + s); // BB
    }
}
// 배열 전달 - 참조가 전달되어 내부 변경이 반영
// 문자열 전달 - 값이 복사되어 외부 변수에 영향이 없음