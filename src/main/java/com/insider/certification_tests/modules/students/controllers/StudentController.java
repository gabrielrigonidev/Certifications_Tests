package com.insider.certification_tests.modules.students.controllers;

import com.insider.certification_tests.modules.students.dto.VerifyHasCertificationDTO;
import com.insider.certification_tests.modules.students.useCases.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired //Injeção de Dependência - Inicialização do UseCase
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO){
        //Email
        //Tecnology

        System.out.println(verifyHasCertificationDTO);
        return "Usuário pode fazer a prova";

    }
}
