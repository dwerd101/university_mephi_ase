package ru.ase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ase.demo.entity.Turnout;

@Repository
public interface TurnoutRepository  extends JpaRepository<Turnout,Long> {
}
