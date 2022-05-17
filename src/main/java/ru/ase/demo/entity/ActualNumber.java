package ru.ase.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "actual_number")
@Getter
@Setter
public class ActualNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actualNumberId;
    private LocalDate date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_dso_id", referencedColumnName = "project_dso_id")
    private ProjectDso projectDsoId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "indicator_id", referencedColumnName = "indicator_id")
    private Indicator indicatorId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employees_type_id", referencedColumnName = "employees_type_id")
    private EmployeesType employeesTypeId;
    private Long employeeNumber;
    private Long outStaffingOtherDsoNumber;
    private Long contractingDsoNumber;
    private Long localPersonalNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ActualNumber actualNumber = (ActualNumber) o;
        return actualNumberId != null && Objects.equals(actualNumberId, actualNumber.actualNumberId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
