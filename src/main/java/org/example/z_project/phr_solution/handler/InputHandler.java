package org.example.z_project.phr_solution.handler;

import org.example.z_project.phr_solution.dto.patient.request.PatientCreateRequestDto;
import org.example.z_project.phr_solution.dto.patient.request.PatientUpdateRequestDto;

import java.util.Scanner;

public class InputHandler {
    private static final Scanner sc = new Scanner(System.in);

    public static int getChoice() {
        while (!sc.hasNextInt()) {
            System.out.println("숫자를 입력해주세요.");
            sc.nextLine();
        }

        int choice = sc.nextInt();
        sc.nextLine(); // 버퍼 처리
        return choice;
    }

    public static String getInput(String prompt) {
        System.out.print(prompt + ": ");
        return sc.nextLine().trim(); // .trim(): 문자열 양쪽 공백을 제거
    }

    public static Long getIdInput() {
        String input = getInput("ID를 입력하세요");
        return Long.parseLong(input);
    }

    // 요청
    // 1) 환자 정보 - 생성, 수정
    public static PatientCreateRequestDto createPatientRequest() {
        PatientCreateRequestDto dto = null;

        try {
            String name = getInput("환자 이름을 입력해주세요");
            int age = Integer.parseInt(getInput("환자 나이를 입력해주세요"));
            String gender = getInput("환자 성별을 입력해주세요");

            dto = new PatientCreateRequestDto(name, age, gender);
        } catch (NumberFormatException e) {
            System.out.println("환자 나이는 숫자값을 입력해야합니다: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return dto;
    }

    public static PatientUpdateRequestDto updatePatientRequest() {
        PatientUpdateRequestDto dto = null;

        try {
            String name = getInput("환자 이름을 입력해주세요");
            int age = Integer.parseInt(getInput("환자 나이를 입력해주세요"));

            dto = new PatientUpdateRequestDto(name, age);
        } catch (NumberFormatException e) {
            System.out.println("환자 나이는 숫자값을 입력해야합니다: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return dto;
    }

    public static void closeScanner() {
        sc.close();
    }
}
