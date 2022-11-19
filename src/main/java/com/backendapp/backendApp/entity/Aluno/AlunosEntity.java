package com.backendapp.backendApp.entity.Aluno;


import com.backendapp.backendApp.entity.Aula.AulaEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Aluno")
public class AlunosEntity {

    @Id
    @Column(name = "id_client")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;

    @Column(name = "client_name")
    private String name;

    @Column(name = "client_phone", length = 10)
    private String phone;


    private AulaEntity aula;


}
