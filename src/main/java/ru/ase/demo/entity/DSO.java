package ru.ase.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dso")
@Getter
@Setter
public class DSO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dso_id")
    private Long dsoId;
    @Column(length = 15)
    private String dsoName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DSO dso = (DSO) o;
        return dsoId != null && Objects.equals(dsoId, dso.dsoId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
