package ru.ase.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ase.demo.entity.Indicator;
import ru.ase.demo.repository.IndicatorRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/indicator")
public class IndicatorController {

    private final IndicatorRepository indicatorRepository;

    @GetMapping("/")
    public ResponseEntity<List<Indicator>> findAll() {
        return  ResponseEntity.ok(indicatorRepository.findAll());
    }
    @PostMapping("/save-or-update")
    public ResponseEntity<Indicator> save(@RequestBody Indicator indicator) {
        return  ResponseEntity.ok(indicatorRepository.save(indicator));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable Long id) {
        indicatorRepository.deleteById(id);
    }
}
