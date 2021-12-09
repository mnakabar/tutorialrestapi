package com.developper.tutorialrestapi.repository;

import com.developper.tutorialrestapi.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
}
