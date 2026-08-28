package com.uscms.controller;

import com.uscms.model.Sport;
import com.uscms.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sports")
@CrossOrigin(origins = "*")
public class SportController {

    @Autowired
    private SportRepository sportRepository;

    // GET all
    @GetMapping
    public List<Sport> getAllSports() {
        return sportRepository.findAll();
    }

    // GET by ID
    @GetMapping("/{id}")
    public Sport getSportById(@PathVariable Long id) {
        return sportRepository.findById(id).orElse(null);
    }

    // POST create
    @PostMapping
    public Sport createSport(@RequestBody Sport sport) {
        return sportRepository.save(sport);
    }

    // DELETE by ID
    @DeleteMapping("/{id}")
    public void deleteSport(@PathVariable Long id) {
        sportRepository.deleteById(id);
    }
}
