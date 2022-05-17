package ru.ase.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "OTTB")
@Getter
@Setter
public class OTTB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long otTbId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_dso_id", referencedColumnName = "project_dso_id")
    private ProjectDso projectDsoId;
    private LocalDate date;
    private Long customerIssued;
    private Long customerRevealed;
    private Long customerFixed;
    private Long dsoIssued;
    private Long dsoRevealed;
    private Long dsoFixed;
}
