package com.onetoimprove.OneToImprove.controllers;

import com.onetoimprove.OneToImprove.DTOs.EmpleadoDTO;
import com.onetoimprove.OneToImprove.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping("/empleados")
    public List<EmpleadoDTO> getEmpleados(){
        return empleadoRepository.findAll().stream().map(Empleado -> new EmpleadoDTO(Empleado)).collect(toList());
    }

    @GetMapping("empleado/{id}")
    public EmpleadoDTO getEmpleadoById(@PathVariable Long id){
        return empleadoRepository.findById(id).map(empleado -> new EmpleadoDTO(empleado)).orElse(null);
    }

}
