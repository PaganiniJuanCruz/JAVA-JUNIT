package com.junit.junit.controller;

import com.junit.junit.entity.Pupil;
import com.junit.junit.repository.PupilRepository;
import com.junit.junit.service.PupilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiPupils")
public class PupilController {
    @Autowired
    private PupilRepository pupilRepository;

    private PupilController service;

    public PupilController(PupilController service){ this.service = service;}

    @GetMapping("/pupil")
    public @ResponseBody
    String welcome(){return service.welcome();}

    @GetMapping("/")
    public List<Pupil> all(){
        return (List<Pupil>) pupilRepository.findAll();
    }

    @PostMapping("/{id}")
    Pupil postPupil(@RequestBody Pupil pupil){
        return pupilRepository.save(pupil);
    }

    @PutMapping("/{id}")
    Pupil putPupil(@RequestBody Pupil pupil){
        pupilRepository.delete(pupil);
        return pupilRepository.save(pupil);
    }
}
