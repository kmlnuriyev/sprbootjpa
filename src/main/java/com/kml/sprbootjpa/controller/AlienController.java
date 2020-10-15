package com.kml.sprbootjpa.controller;

import com.kml.sprbootjpa.model.Alien;
import com.kml.sprbootjpa.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController {

    @Autowired
    AlienRepository repository;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/alien")
    public void addAlien(@RequestBody Alien alien) {
        repository.save(alien);
    }

    @PutMapping("/alien")
    public void saveOrUpdateAlien(@RequestBody Alien alien) {
        repository.save(alien);
    }

    @DeleteMapping("/alien/{id}")
    public void deleteAlien(@PathVariable int id) {
        repository.deleteById(id);
    }

    @GetMapping("/alien/{id}")
    public Alien getAlien(@PathVariable("id") int id) {
        return repository.findById(id).orElse(new Alien());
    }

    @GetMapping("/aliens")
    public List<Alien> getAliens() {
        return repository.findAll();
    }
}
