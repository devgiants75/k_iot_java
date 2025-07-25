package org.example.z_project.phr_solution;

public class Question {}

// https://k-it.notion.site/PHR_SOLUTION-23b82808bfd280e9a413cee0dd3b7a64?pvs=74
// >> 위 노션 자료에서 문제 확인하기
// >> 비즈니스 로직 아래 내용 참고 (정답 X)

/*
* // ✅ 헬퍼 메서드 - DTO 변환 공통화 (필수 X)
	private RecordResponseDto toDto(HealthRecord r) {
		return new RecordResponseDto(
			r.getId(),
			r.getPatientId(),
			r.getDateOfVisit(),
			r.getDiagnosis(),
			r.getTreatment(),
			new Date() // 조회 시간
		);
	}

	// ✅ ① 진단별 건강 기록 수 카운팅
	public Map<String, Long> countRecordsByDiagnosis() {
		return recordRepository.findAll().stream()
			.collect(Collectors.groupingBy(
				HealthRecord::getDiagnosis,
				Collectors.counting()
			));
	}

	// ✅ ② 특정 연령대 환자의 건강 기록 목록
	public List<RecordResponseDto> filterRecordsByAge(int minAge) {
		return recordRepository.findAll().stream()
			.filter(r -> {
				Optional<Patient> p = patientRepository.findById(r.getPatientId());
				return p.isPresent() && p.get().getAge() >= minAge;
			})
			.map(this::toDto)
			.collect(Collectors.toList());
	}

	// ✅ ③ 특정 기간 내 진료 기록 조회
	>> 날짜 포맷팅 형식 불일치로 인한 IllegalArgumentException 발생 위험!
	>> service: 예외 처리 필요
	public List<RecordResponseDto> filterRecordsByDateRange(String from, String to) {
		// 1. 날짜 형식 사전 검증 (유효하지 않으면 예외 발생)
        DateValidator.validateOrThrow(from);
        DateValidator.validateOrThrow(to);
        // 2. 날짜 파싱
        LocalDate fromDate = LocalDate.parse(from, DateValidator.formatter);
        LocalDate toDate = LocalDate.parse(to, DateValidator.formatter);

        // 3. 범위 내 기록 필터링
		return recordRepository.findAll().stream()
			.filter(r -> {
                LocalDate visitDate = LocalDate.parse(r.getDateOfVisit(), DateValidator.formatter);
                return !visitDate.isBefore(fromDate) && !visitDate.isAfter(toDate);
            })
            .map(this::toDto)
            .collect(Collectors.toList());
	}
* */