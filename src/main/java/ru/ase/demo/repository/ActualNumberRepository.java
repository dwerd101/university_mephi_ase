package ru.ase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ase.demo.entity.ActualNumber;

@Repository
public interface ActualNumberRepository extends JpaRepository<ActualNumber,Long> {
}
