package org.example.user_reservation.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

// final 또는 @NonNull인 필드만 생성자의 매개변수로 작성
@RequiredArgsConstructor
@Getter
public class Reservation {
    private final Long reservationId; // 각 예약의 고유값
    private final String userId; // 예약자 정보
    private final Date reservationTime; // 예약 시간

    // 활성화 유무를 저장
    private boolean isActive = true;



}
