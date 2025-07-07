package org.example.chapter05;

class BaseballPlayer {
    // === 인스턴스 변수 ===
    // 선수 이름(name -  문자열)
    // 타율(battingAverage - 실수)
    // 홈런 수(homeRuns - 정수)

    // === 정적(클래스) 변수 ===
    // : 생성된 선수의 총 인원(playerCount - 정수)
    // >> 모든 인스턴스에서 공유

    // == 생성자 ==
    // +) 필드값 초기화 & 정적 변수 후위 증가

    // 1) 인스턴스 메서드
    // : double newBattingAverage, int newHomeRuns 값을 전달 받아 각각의 타율과 홈런 수를 업데이트

    // 2) 정적 메서드
    // : 특정 홈런 수 이상인 선수를 평가
    // : 홈런 수가 20개 이상이면 "홈런상 후보! 축하드립니다!"
    // : 미만일 경우 "홈런상 후보에 등록될 수 없습니다." 반환
}

public class E_Practice {
    public static void main(String[] args) {

    }
}
