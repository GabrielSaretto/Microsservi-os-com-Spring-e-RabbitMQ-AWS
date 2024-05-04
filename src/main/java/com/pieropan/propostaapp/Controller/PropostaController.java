package com.pieropan.propostaapp.Controller;

import com.pieropan.propostaapp.dto.PropostaRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proposta")
public class PropostaController {

    @PostMapping
    public ResponseEntity criar(@RequestBody PropostaRequestDto requestDto) {
        return null;
    }
}
