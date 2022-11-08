package com.dh.ClinicaJpa.service;

import com.dh.ClinicaJpa.dto.OdontologoDto;

import com.dh.ClinicaJpa.service.IOdontologoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    private IOdontologoService odontologoService;

    @Test
    public void testcCrearOdontologo(){
        OdontologoDto odontologoDto = new OdontologoDto();
        odontologoDto.setNombre("Juan");
        odontologoDto.setApellido("Solis");
        odontologoDto.setMatricula("12368");



        odontologoService.crearOdontologo(odontologoDto);
        OdontologoDto odontologoJuan = odontologoService.leerOdontologo(1L);

        assertTrue(odontologoJuan != null);


    }

}



//package com.dh.ClinicaJpa.service;
//
//import com.dh.ClinicaJpa.dto.OdontologoDto;
//import com.dh.ClinicaJpa.entity.Odontologo;
//import com.dh.ClinicaJpa.service.IOdontologoService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class OdontologoServiceTest {
//
//    @Autowired
//    IOdontologoService odontologoService;
//
//    @Test
//    public void crearOdontologo() {
//        OdontologoDto odontologoDTO = new OdontologoDto();
//        odontologoDTO.setNombre("Santiago");
//        odontologoDTO.setApellido("Bergallo");
//        odontologoDTO.setMatricula("AB29");
//        odontologoService.crearOdontologo(odontologoDTO);
//        OdontologoDto odontologoSantiago = odontologoService.leerOdontologo(1L);
//
//
//        assertTrue(odontologoSantiago !=null);
//    }
//
//}