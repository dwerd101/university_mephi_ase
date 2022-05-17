package ru.ase.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ase.demo.entity.DSO;
import ru.ase.demo.repository.DSORepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dso")
public class DSOController {
    private final DSORepository dsoRepository;

    @GetMapping("/")
    public ResponseEntity<List<DSO>> findAll() {
        return  ResponseEntity.ok(dsoRepository.findAll());
    }
    @PostMapping("/save-or-update")
    public ResponseEntity<DSO> save(@RequestBody DSO dso) {
        return  ResponseEntity.ok(dsoRepository.save(dso));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable Long id) {
        dsoRepository.deleteById(id);
    }
}
