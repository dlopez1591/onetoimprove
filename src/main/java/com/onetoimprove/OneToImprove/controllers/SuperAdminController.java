package com.onetoimprove.OneToImprove.controllers;

import com.onetoimprove.OneToImprove.DTOs.SuperAdminDTO;
import com.onetoimprove.OneToImprove.models.SuperAdmin;
import com.onetoimprove.OneToImprove.repositories.SuperAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api")
public class SuperAdminController {
    @Autowired
    private SuperAdminRepository superAdminRepository;

    @GetMapping("/superadmin")
    public List<SuperAdminDTO> getSuperAdmins(){
        return superAdminRepository.findAll().stream().map(SuperAdmin -> new SuperAdminDTO(SuperAdmin)).collect(toList());
    }
}
