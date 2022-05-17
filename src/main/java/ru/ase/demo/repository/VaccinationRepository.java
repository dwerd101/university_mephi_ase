package ru.ase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ase.demo.entity.Vaccination;

@Repository
public interface VaccinationRepository extends JpaRepository<Vaccination,Long> {
}
