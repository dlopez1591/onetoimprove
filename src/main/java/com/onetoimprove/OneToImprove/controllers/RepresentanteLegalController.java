package com.onetoimprove.OneToImprove.controllers;

import com.onetoimprove.OneToImprove.DTOs.RepresentanteLegalDTO;
import com.onetoimprove.OneToImprove.models.RepresentanteLegal;
import com.onetoimprove.OneToImprove.repositories.EmpleadoRepository;
import com.onetoimprove.OneToImprove.repositories.RepresentanteLegalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api")
public class RepresentanteLegalController {

    @Autowired
    private RepresentanteLegalRepository representanteLegalRepository;
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping("/representantes")
    public List<RepresentanteLegalDTO> getRepresentantes(){
        return representanteLegalRepository.findAll().stream().map(RepresentanteLegal -> new RepresentanteLegalDTO(RepresentanteLegal)).collect(toList());
    }
    @GetMapping("/represenante/{id}")
    public RepresentanteLegalDTO getRepresenanteById(@PathVariable Long id){
        return representanteLegalRepository.findById(id).map(representanteLegal -> new RepresentanteLegalDTO(representanteLegal)).orElse(null);
    }
    @PostMapping("/representante/create")
    public ResponseEntity<RepresentanteLegal> addRepresentanteLegal(@RequestBody RepresentanteLegal representanteLegal){
        if(representanteLegal != null){
            representanteLegalRepository.save(representanteLegal);
            return new ResponseEntity<>(representanteLegal, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
   @PostMapping("representante/update")
    public ResponseEntity<RepresentanteLegal> updateRepresentanteLegal (@RequestBody RepresentanteLegal updateRepresentanteLegal){
        Optional<RepresentanteLegal> representanteUpdate = representanteLegalRepository.findById(updateRepresentanteLegal.getId());
        if(representanteUpdate.isPresent()){
            RepresentanteLegal existingRepresentante = representanteUpdate.get();
            existingRepresentante.setNombre(updateRepresentanteLegal.getNombre());
            existingRepresentante.setEmail(updateRepresentanteLegal.getEmail());
            existingRepresentante.setPassword(updateRepresentanteLegal.getPassword());
            existingRepresentante.setFechaNacimiento(updateRepresentanteLegal.getFechaNacimiento());
            existingRepresentante.setDNI(updateRepresentanteLegal.getDNI());
            existingRepresentante.setFechaAlta(updateRepresentanteLegal.getFechaAlta());
            existingRepresentante.setTipoLicencia(updateRepresentanteLegal.getTipoLicencia());
            existingRepresentante.setImagen(updateRepresentanteLegal.getImagen());
            existingRepresentante.setFechaCaducidad(updateRepresentanteLegal.getFechaCaducidad());
            RepresentanteLegal updated = representanteLegalRepository.save(existingRepresentante);
            return ResponseEntity.ok(updated);
        }else{
            return ResponseEntity.notFound().build();
        }
   }

}
