package com.inditex.inditex.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CotizacionesService {
    List<String> getCotizaciones();
}
