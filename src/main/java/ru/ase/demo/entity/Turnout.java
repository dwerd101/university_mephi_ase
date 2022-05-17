package ru.ase.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "turnout")
@Getter
@Setter
public class Turnout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long turnoutId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_dso_id", referencedColumnName = "project_dso_id")
    private ProjectDso projectDsoId;
    private LocalDate date;
    private Long turnoutNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Turnout turnout = (Turnout) o;
        return turnoutId != null && Objects.equals(turnoutId, turnout.projectDsoId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
