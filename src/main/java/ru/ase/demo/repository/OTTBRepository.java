package ru.ase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ase.demo.entity.OTTB;

@Repository
public interface OTTBRepository extends JpaRepository<OTTB,Long> {
}
