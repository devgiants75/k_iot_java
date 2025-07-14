package org.example.chapter12.controller;

import org.example.chapter12.dto.StudentRequestDto;
import org.example.chapter12.dto.StudentResponseDto;
import org.example.chapter12.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private final List<Student> studentList;
    private int nextId = 1;

    public StudentController(List<Student> studentList) {
        this.studentList = studentList;
    }

    // 학생 추가(Create)
    public void addStudent(StudentRequestDto dto) {
        Student student = new Student(nextId++, dto.getName(), dto.getAge(), dto.getStudentNumber());
        studentList.add(student);
        System.out.println(dto.getName() + "학생이 추가되었습니다. 학번: " + dto.getStudentNumber());
    }

    // 학생 조회 (전체)
    public List<StudentResponseDto> getAllStudents() {
        List<StudentResponseDto> response = new ArrayList<>();

        // 데이터 가공 과정 (Student >> StudentResponseDto)
        for (Student student: studentList) {
            response.add(new StudentResponseDto(
                    student.getName(),
                    student.getAge(),
                    student.getStudentNumber(),
                    student.getCreatedAt()
            ));
        }

        return response;
    }

    // 학생 조회 (단건)
    public StudentResponseDto getStudentById(int id) {
        for (Student student: studentList) {
            if (student.getStudentId() == id) {
                return new StudentResponseDto(
                        student.getName(),
                        student.getAge(),
                        student.getStudentNumber(),
                        student.getCreatedAt()
                ); // 조회한 학생이 존재하는 경우 (데이터 반환)
            }
        }

        return null; // 조회한 학생이 없을 경우 (null 반환)
    }

    // 학생 수정
    public boolean updateStudent(int id, StudentRequestDto dto) {
        for (Student student: studentList) {
            if (student.getStudentId() == id) {
                student.setName(dto.getName());
                student.setAge(dto.getAge());
                return true;
            }
        }
        return false;
    }

    // 학생 삭제
    public boolean removeStudent(int id) {
        for (Student student: studentList) {
            if (student.getStudentId() == id) {
                studentList.remove(student);
                return true;
            }
        }

        return false;
    }
}
