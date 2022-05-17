package ru.ase.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employees_type")
@Getter
@Setter
public class EmployeesType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employees_type_id")
    private Long employeesTypeId;
    @Column(length = 40)
    private String employeeTypeName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeesType employeesType = (EmployeesType) o;
        return employeesTypeId != null && Objects.equals(employeesTypeId, employeesType.employeesTypeId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
