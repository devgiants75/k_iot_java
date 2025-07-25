package org.example.z_project.phr_solution.dto.patient.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PatientUpdateRequestDto {
    private String name;
    private int age;
}
