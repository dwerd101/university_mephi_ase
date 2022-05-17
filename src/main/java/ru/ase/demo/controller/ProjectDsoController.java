package ru.ase.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ase.demo.entity.ProjectDso;
import ru.ase.demo.repository.ProjectDsoRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/project-dso")
public class ProjectDsoController {
    private final ProjectDsoRepository projectDsoRepository;

    @GetMapping("/")
    public ResponseEntity<List<ProjectDso>> findAll() {
        return  ResponseEntity.ok( projectDsoRepository.findAll());
    }
    @PostMapping("/save-or-update")
    public ResponseEntity<ProjectDso> save(@RequestBody ProjectDso projectDso) {
        return  ResponseEntity.ok( projectDsoRepository.save(projectDso));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable Long id) {
        projectDsoRepository.deleteById(id);
    }
}
