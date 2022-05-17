package ru.ase.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "vaccination")
@Getter
@Setter
public class Vaccination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vaccinationId;
    private LocalDate date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_dso_id", referencedColumnName = "project_dso_id")
    private ProjectDso projectDsoId;
    private Long averageNumber;
    private Long vaccinated;
    private Long averageNumberNrb;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Vaccination vaccination = (Vaccination) o;
        return vaccinationId != null && Objects.equals(vaccinationId, vaccination.vaccinationId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
