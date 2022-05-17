package ru.ase.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ase.demo.entity.EmployeesType;
import ru.ase.demo.repository.EmployeesTypeRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employes-type")
public class EmployeesTypeController {
    private final EmployeesTypeRepository employeesTypeRepository;

    @GetMapping("/")
    public ResponseEntity<List<EmployeesType>> findAll() {
        return  ResponseEntity.ok(employeesTypeRepository.findAll());
    }
    @PostMapping("/save-or-update")
    public ResponseEntity<EmployeesType> save(@RequestBody EmployeesType employeesType) {
        return  ResponseEntity.ok(employeesTypeRepository.save(employeesType));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable Long id) {
        employeesTypeRepository.deleteById(id);
    }
}
