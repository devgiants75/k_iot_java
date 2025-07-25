package org.example.z_project.phr_solution.dto.patient.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PatientCreateRequestDto {
    private String name;
    private int age;
    private String gender;
}
