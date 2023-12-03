package com.onetoimprove.OneToImprove.controllers;

import com.onetoimprove.OneToImprove.DTOs.NoticiaOTIDTO;
import com.onetoimprove.OneToImprove.models.NoticiaOTI;
import com.onetoimprove.OneToImprove.repositories.NoticiaOTIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api")
public class NoticiaOTIController {
    @Autowired
    private NoticiaOTIRepository noticiaOTIRepository;

    @GetMapping ("/noticias")
    public List<NoticiaOTIDTO> getNoticias (){
        return noticiaOTIRepository.findAll().stream().map(noticiaOTI -> new NoticiaOTIDTO(noticiaOTI)).collect(toList());
    }
    @PostMapping("noticia/create")
    public ResponseEntity<NoticiaOTIDTO> addNoticia(@RequestBody NoticiaOTI noticiaOTI){
        if(noticiaOTI !=null){
            NoticiaOTIDTO noticia = new NoticiaOTIDTO(noticiaOTI);
            noticiaOTIRepository.save(noticiaOTI);
            return  new ResponseEntity <> (noticia, HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
