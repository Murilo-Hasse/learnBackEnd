package br.com.heardcontrol.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.heardcontrol.Projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
