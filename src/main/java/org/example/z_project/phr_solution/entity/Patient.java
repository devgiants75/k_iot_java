package org.example.z_project.phr_solution.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

// 환자 정보 클래스
@Data
@AllArgsConstructor
public class Patient {
    private Long id; // 환자 고유 번호
    private String name;
    private int age;
    private String gender;
}
