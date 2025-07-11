package org.example.chapter10;

// === 이벤트 관리 시스템 === //
// : 이벤트 참가자 명단 & 대기열 관리를 위한 시스템
// - 참가자는 사전 등록된 명단을 통해 이벤트 참가
// - 명단이 가득 찰 경우 대기열 추가, 참가자가 떠나면 대기열의 다음 사람이 추가

// 1) 이벤트 참가자 명단 관리: 사전 등록, 당일 추가 참가자 등록 X
// : ArrayList (목록 추가/삭제 X, 참가자 조회 O)

// 2) 대기열 관리
// : 이벤트의 한정된 좌석, 좌석이 모두 차면 추가 참가자는 대기열에 등록
// : LinkedList (목록 추가/삭제 O, 참가자 조회 X)

import java.util.ArrayList;
import java.util.LinkedList;

class EventManagement {
    // == 필드 == //
    ArrayList<String> participantList = new ArrayList<>();
    LinkedList<String> waitingQueue = new LinkedList<>();

    // == 메서드 == //
    void addParticipant(String name) {
        participantList.add(name);
    }

    void addToWaitingQueue(String name) {
        waitingQueue.add(name);
    }

    void leaveParticipant(String name) {
        // 대기열의 인원이 존재해야만! 대기열 인원을 참가자 명단에 추가 가능
        // : 대기열 크기(.size())가 0이상
        if (waitingQueue.size() > 0) {
            String newParticipant = waitingQueue.remove(0); // 대기열에서 제거
            addParticipant(newParticipant); // 참가자 명단에 추가
        }
    }

    boolean checkParticipant(String name) {
        return participantList.contains(name);
    }
}

public class C_ListPractice {
    public static void main(String[] args) {
        EventManagement eventManagement = new EventManagement();

        eventManagement.addParticipant("이승아");
        eventManagement.addParticipant("조승범");
        eventManagement.addParticipant("진상영");
        eventManagement.addParticipant("윤대휘");
        eventManagement.addParticipant("박성욱");

        eventManagement.addToWaitingQueue("김소빈");
        eventManagement.addToWaitingQueue("윤안나");
        eventManagement.addToWaitingQueue("이은우");
        eventManagement.addToWaitingQueue("최현우");

        System.out.println(eventManagement.participantList); // [이승아, 조승범, 진상영, 윤대휘, 박성욱]
        System.out.println(eventManagement.waitingQueue); // [김소빈, 윤안나, 이은우, 최현우]

        eventManagement.addToWaitingQueue("이혜지");
        eventManagement.addToWaitingQueue("김준일");

        eventManagement.leaveParticipant("이승아");
        eventManagement.leaveParticipant("조승범");
        eventManagement.leaveParticipant("윤대휘");

        System.out.println(eventManagement.participantList);
        // [이승아, 조승범, 진상영, 윤대휘, 박성욱, 김소빈, 윤안나, 이은우]

        System.out.println(eventManagement.waitingQueue); // [최현우, 이혜지, 김준일]

        System.out.println(eventManagement.checkParticipant("조승범")); // true
        System.out.println(eventManagement.checkParticipant("최현우")); // false
    }
}
