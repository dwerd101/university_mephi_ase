package ru.ase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ase.demo.entity.Indicator;

@Repository
public interface IndicatorRepository extends JpaRepository<Indicator,Long> {
}
