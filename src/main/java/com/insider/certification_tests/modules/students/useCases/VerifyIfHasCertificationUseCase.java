package com.insider.certification_tests.modules.students.useCases;

import com.insider.certification_tests.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service //REGRA DE NEGÓCIO
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto){
        if(dto.getEmail().equals("rigoni@gmail.com") && dto.getTechnology().equals("JAVA")){
            return true;
        }
        return false;
    }
}
