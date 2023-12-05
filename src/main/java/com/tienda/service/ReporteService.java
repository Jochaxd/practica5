package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReporteService {
    
    public ResponseEntity<Resource> generaReporte(
            String reporte, //El nombre derl archivo llamado .jasper (usuarios.jas[er o ventas.jasper)
            Map<String, Object> parametros, //se pasan los parámetros del archivo de jasper (nombre, apellido, telefono...)
            String tipo) throws IOException; //El tipo de reporte que el suaurio va a ver o descargar (csv, pdf, excel, xlsx, txt)
}
