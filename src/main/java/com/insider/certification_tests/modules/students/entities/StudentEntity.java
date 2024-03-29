package com.insider.certification_tests.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data //Getters e Setters
@AllArgsConstructor //Construtores
@NoArgsConstructor //Construtores Vazios

public class StudentEntity {
    private UUID id;
    private String email;
    private List<CertificationStudentEntity> certificationStudentEntity;
}
