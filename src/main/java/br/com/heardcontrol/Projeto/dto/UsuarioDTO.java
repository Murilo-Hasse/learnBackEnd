package br.com.heardcontrol.Projeto.dto;

import org.springframework.beans.BeanUtils;

import br.com.heardcontrol.Projeto.entity.UsuarioEntity;

public class UsuarioDTO {
	private Long id;
	private String name;
	private String login;
	private String password;
	private String email;

	public UsuarioDTO(UsuarioEntity usuario) {
		BeanUtils.copyProperties (usuario, this);
	}
	
	public UsuarioDTO() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
