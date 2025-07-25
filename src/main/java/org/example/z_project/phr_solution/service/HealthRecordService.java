package org.example.z_project.phr_solution.service;

import org.example.z_project.phr_solution.dto.health_record.request.RecordCreateRequestDto;
import org.example.z_project.phr_solution.dto.health_record.response.RecordListResponseDto;

import java.util.List;
import java.util.Map;

public interface HealthRecordService {
    void createRecord(RecordCreateRequestDto dto);
    List<RecordListResponseDto> getAllRecords();
    List<RecordListResponseDto> filterRecordsByDiagnosis(String diagnosis);
    void deleteRecord(Long id);

    // 진단별 건강 기록 수 카운팅
//    Map<String, Long> countRecordsByDiagnosis();
//    List<RecordListResponseDto> filterRecordsByAge(int minAge);
//    List<RecordListResponseDto> filterRecordsByDateRange(String from, String to);
}
