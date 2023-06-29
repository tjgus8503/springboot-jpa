package com.example.jpa.dto;

import com.example.jpa.entities.StudentEntity;
import lombok.Data;

@Data
public class StudentDto {
    private Long id; // Entity.id
    private String name; // Entity.name
    private String email; // Entity.email

    // 정적 팩토리 메소드 패턴
    // static factory method pattern
    public static StudentDto fromEntity(StudentEntity studentEntity) {
        StudentDto dto = new StudentDto(); // 생성자 호출
        dto.setId(studentEntity.getId());
        dto.setName(studentEntity.getName());
        dto.setEmail(studentEntity.getEmail());
        return dto;
    }
}
