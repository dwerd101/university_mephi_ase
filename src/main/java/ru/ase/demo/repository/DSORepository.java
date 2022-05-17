package ru.ase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ase.demo.entity.DSO;

@Repository
public interface DSORepository  extends JpaRepository<DSO,Long> {
}
