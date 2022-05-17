package ru.ase.demo.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ase.demo.entity.OTTB;
import ru.ase.demo.entity.Project;
import ru.ase.demo.repository.OTTBRepository;
import ru.ase.demo.repository.ProjectRepository;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/project")
public class ProjectController {

    private final ProjectRepository projectRepository;

    @GetMapping("/")
    public ResponseEntity<List<Project>> findAll() {
        return  ResponseEntity.ok( projectRepository.findAll());
    }
    @PostMapping("/save-or-update")
    public ResponseEntity<Project> save(@RequestBody Project project) {
        return  ResponseEntity.ok( projectRepository.save(project));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable Long id) {
        projectRepository.deleteById(id);
    }
}
