package ru.ase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ase.demo.entity.ProjectDso;

@Repository
public interface ProjectDsoRepository  extends JpaRepository<ProjectDso,Long> {
}
