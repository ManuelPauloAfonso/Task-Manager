package com.gerenciador.tarefas.repository;

import com.gerenciador.tarefas.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
}
