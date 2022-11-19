package com.backendapp.backendApp.repository;

import com.backendapp.backendApp.entity.Aluno.AlunosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<AlunosEntity, Long > {
}
