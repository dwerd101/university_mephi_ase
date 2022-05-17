package ru.ase.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ase.demo.entity.OTTB;
import ru.ase.demo.repository.OTTBRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ottb")
public class OTTBController {
    private final OTTBRepository ottbRepository;

    @GetMapping("/")
    public ResponseEntity<List<OTTB>> findAll() {
        return  ResponseEntity.ok( ottbRepository.findAll());
    }
    @PostMapping("/save-or-update")
    public ResponseEntity<OTTB> save(@RequestBody OTTB ottb) {
        return  ResponseEntity.ok( ottbRepository.save(ottb));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable Long id) {
        ottbRepository.deleteById(id);
    }
}
