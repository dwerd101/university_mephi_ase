package ru.ase.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ase.demo.entity.Turnout;
import ru.ase.demo.repository.TurnoutRepository;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/turnout")
public class TurnoutController {
    private final TurnoutRepository turnoutRepository;

    @GetMapping("/")
    public ResponseEntity<List<Turnout>> findAll() {
        return  ResponseEntity.ok( turnoutRepository.findAll());
    }
    @PostMapping("/save-or-update")
    public ResponseEntity<Turnout> save(@RequestBody Turnout turnout) {
        return  ResponseEntity.ok( turnoutRepository.save(turnout));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable Long id) {
        turnoutRepository.deleteById(id);
    }
}
