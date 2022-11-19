package com.backendapp.backendApp.DTO;

import com.backendapp.backendApp.entity.Aluno.AlunosEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AulasDTO {

    private Date time;

    private Date duration;

    private int quantityAvailable;

    private AlunosEntity alunos;
}
