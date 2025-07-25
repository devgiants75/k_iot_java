package org.example.z_project.phr_solution.controller;

import org.example.z_project.phr_solution.dto.patient.request.PatientCreateRequestDto;
import org.example.z_project.phr_solution.dto.patient.request.PatientUpdateRequestDto;
import org.example.z_project.phr_solution.dto.patient.response.PatientDetailResponseDto;
import org.example.z_project.phr_solution.dto.patient.response.PatientListResponseDto;
import org.example.z_project.phr_solution.service.PatientService;
import org.example.z_project.phr_solution.service.impl.PatientServiceImpl;

import java.util.List;

public class PatientController {
    private final PatientService patientService;

    public PatientController() {
        this.patientService = new PatientServiceImpl();
    }

    public void registerPatient(PatientCreateRequestDto dto) {
        patientService.registerPatient(dto);
    }

    public List<PatientListResponseDto> getAllPatients() {
        List<PatientListResponseDto> result = patientService.listAllPatients();
        return result;
    }

    public PatientDetailResponseDto getPatientById(Long id) {
        PatientDetailResponseDto result = patientService.getPatientById(id);
        return result;
    }

    public void updatePatient(Long id, PatientUpdateRequestDto dto) {
        patientService.updatePatient(id, dto);
    }

    public void deletePatient(Long id) {
        patientService.deletePatient(id);
    }
}
