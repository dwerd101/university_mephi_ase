package ru.ase.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "project_dso")
@Getter
@Setter
public class ProjectDso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_dso_id")
    private Long projectDsoId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
    private Project projectId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dso_id", referencedColumnName = "dso_id")
    private DSO dsoId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProjectDso projectDso = (ProjectDso) o;
        return projectDsoId != null && Objects.equals(projectId, projectDso.projectDsoId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
