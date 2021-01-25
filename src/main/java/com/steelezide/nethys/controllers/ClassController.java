package com.steelezide.nethys.controllers;

import com.steelezide.nethys.pojos.PlayerClass;
import com.steelezide.nethys.services.ClassService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Dtos.ClassDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("class")
public class ClassController {
    
    private ClassService classService;

    @Autowired
    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @GetMapping("{name}")
    public Mono<PlayerClass> getClass(@PathVariable String name){
        return null;   
    }

    @GetMapping
    public Flux<PlayerClass> getAllClasses(){
        return null;   
    }

    @PostMapping
    public void createClass(@RequestBody ClassDto classDto){
        
    }

}   
