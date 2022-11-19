package com.backendapp.backendApp.entity.Aula;

import com.backendapp.backendApp.entity.Aluno.AlunosEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Aula")
public class AulaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aula")
    private Long idAula;

    @Column(name = "time_to_match")
    private Date time;

    @Column(name = "duration_class")
    private Date duration;

    @Column(name = "quantity_available")
    private int quantityAvailable;

    @Column(name = "alunos")
    private AlunosEntity alunos;

}
