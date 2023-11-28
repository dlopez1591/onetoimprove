package com.onetoimprove.OneToImprove.controllers;

import com.onetoimprove.OneToImprove.DTOs.AdminDTO;
import com.onetoimprove.OneToImprove.models.Admin;
import com.onetoimprove.OneToImprove.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api")
public class AdminController {
    @Autowired
    AdminRepository adminRepository;

    @GetMapping ("/admins")
    public List<AdminDTO> getAdmins(){
        return adminRepository.findAll().stream().map(Admin -> new AdminDTO(Admin)).collect(toList());
    }
    @GetMapping("/admin/{id}")
    public AdminDTO getClientById(@PathVariable Long id){
        return adminRepository.findById(id).map(admin -> new AdminDTO(admin)).orElse(null);
    }

    @PostMapping("/admin/create")
    public ResponseEntity<Admin> createAdmin (@RequestBody Admin admin){
        if(admin != null){
            adminRepository.save(admin);
            return new ResponseEntity<>(admin, HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>(admin, HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/admin/update")
    public ResponseEntity<Admin> updateAdmin(@RequestParam Long id, @RequestBody Admin updatedAdmin) {
        return adminRepository.findById(id)
                .map(existingAdmin -> {
                    existingAdmin.setNombre(updatedAdmin.getNombre());
                    existingAdmin.setCargo(updatedAdmin.getCargo());
                    existingAdmin.setEmail(updatedAdmin.getEmail());
                    existingAdmin.setPassword(updatedAdmin.getPassword());
                    existingAdmin.setImagen(updatedAdmin.getImagen());

                    Admin updated = adminRepository.save(existingAdmin);
                    return ResponseEntity.ok().body(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }


}
