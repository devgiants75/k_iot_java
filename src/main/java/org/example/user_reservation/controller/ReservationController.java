package org.example.user_reservation.controller;

import org.example.user_reservation.service.ReservationService;
import org.example.user_reservation.service.UserService;
import org.example.user_reservation.service.implement.ReservationServiceImpl;
import org.example.user_reservation.service.implement.UserServiceImpl;

import java.util.Scanner;

public class ReservationController {
    private final UserService userService;
    private final ReservationService reservationService;

    public ReservationController() {
        this.userService = new UserServiceImpl();
        this.reservationService = new ReservationServiceImpl(userService);
    }

    public void run() {

    }

    private void displayMenu() {
        System.out.println("1. 사용자 등록 | 2. 로그인 | 3. 로그아웃");
        System.out.println("4. 예약 등록 | 5. 예약 확인 | 6. 예약 취소");
        System.out.println("7. 종료");
        System.out.print("선택 >> ");
    }

    private int getChoice(Scanner sc) {
        while (!sc.hasNextInt()) {
            // hasNextInt()
            // : 입력값이 int면 true, 그렇지 않으면 false 반환

            // 입력값이 정수가 아닌 경우
            System.out.println("숫자를 입력해주세요.");
            sc.next();
        }
        return sc.nextInt();
    }
}
