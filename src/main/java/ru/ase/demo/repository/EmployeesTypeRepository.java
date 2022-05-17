package ru.ase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ase.demo.entity.EmployeesType;

@Repository
public interface EmployeesTypeRepository extends JpaRepository<EmployeesType,Long> {
}
