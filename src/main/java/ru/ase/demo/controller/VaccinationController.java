package ru.ase.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ase.demo.entity.Vaccination;
import ru.ase.demo.repository.VaccinationRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vaccination")
public class VaccinationController {
    private final VaccinationRepository vaccinationRepository;

    @GetMapping("/")
    public ResponseEntity<List<Vaccination>> findAll() {
        return  ResponseEntity.ok( vaccinationRepository.findAll());
    }
    @PostMapping("/save-or-update")
    public ResponseEntity<Vaccination> save(@RequestBody Vaccination vaccination) {
        return  ResponseEntity.ok( vaccinationRepository.save(vaccination));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable Long id) {
        vaccinationRepository.deleteById(id);
    }
}
