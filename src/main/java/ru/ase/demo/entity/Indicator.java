package ru.ase.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "indicator")
@Getter
@Setter
public class Indicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "indicator_id")
    private Long indicatorId;
    @Column(length = 80)
    private String indicatorName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Indicator indicator = (Indicator) o;
        return indicatorId != null && Objects.equals(indicatorId, indicator.indicatorId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
