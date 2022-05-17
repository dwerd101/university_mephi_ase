package ru.ase.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ase.demo.entity.ActualNumber;
import ru.ase.demo.repository.ActualNumberRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/actual-number")
public class ActualNumberController {
    private final ActualNumberRepository actualNumberRepository;

    @GetMapping("/")
    public ResponseEntity<List<ActualNumber>> findAll() {
        return  ResponseEntity.ok(actualNumberRepository.findAll());
    }
    @PostMapping("/save-or-update")
    public ResponseEntity<ActualNumber> save(@RequestBody ActualNumber actualNumber) {
        return  ResponseEntity.ok(actualNumberRepository.save(actualNumber));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable Long id) {
        actualNumberRepository.deleteById(id);
    }

}
