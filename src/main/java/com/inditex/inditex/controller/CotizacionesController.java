package com.inditex.inditex.controller;


import com.inditex.inditex.services.CotizacionesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class CotizacionesController {

    @GetMapping("/cotizaciones")
    public @ResponseBody
    ResponseEntity<List<String>> getCotizaciones(){
        List<String> cotizaciones= List.of(
                "algo",
                "algo2"
        );
        return ResponseEntity.ok().body(cotizaciones);
    }
}
