package com.onetoimprove.OneToImprove.controllers;

import com.onetoimprove.OneToImprove.DTOs.EmpleadoDTO;
import com.onetoimprove.OneToImprove.models.Empleado;
import com.onetoimprove.OneToImprove.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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

    @PostMapping("empleado/create")
    public ResponseEntity<Empleado> createEmpleado(@RequestBody Empleado empleado){
        if(empleado !=null){
            empleadoRepository.save(empleado);
            return new ResponseEntity<>(empleado, HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/empleado/update")
    public ResponseEntity<Empleado> updateEmpleado(@RequestBody Empleado updatedEmpleado) {
        Optional<Empleado> empleadoUpdate = empleadoRepository.findById(updatedEmpleado.getId());

        if (empleadoUpdate.isPresent()) {
            // El empleado existe, actualizamos sus datos
            Empleado existingEmpleado = empleadoUpdate.get();
            existingEmpleado.setNombre(updatedEmpleado.getNombre());
            existingEmpleado.setCargo(updatedEmpleado.getCargo());
            existingEmpleado.setEmail(updatedEmpleado.getEmail());
            existingEmpleado.setFechaFin(updatedEmpleado.getFechaFin());
            existingEmpleado.setEstadoEmpleado(updatedEmpleado.getEstadoEmpleado());

            Empleado updated = empleadoRepository.save(existingEmpleado);

            return ResponseEntity.ok(updated);
        } else {
            // El empleado no existe
            return ResponseEntity.notFound().build();
        }
    }
}
