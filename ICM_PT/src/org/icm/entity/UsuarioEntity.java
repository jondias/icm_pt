package org.icm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.icm.vo.UsuarioVO;

//@Entity
//@Table(name="APP.USUARIO")
public class UsuarioEntity extends UsuarioVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="usuario")
	public String getUsuario() {
		return super.getUser();
	}
	
	public void setUsuario(String usuario) {
		super.setUser(usuario);
	}
	
	@Column(name="senha")
	public String getSenha() {
		return super.getPassword();
	}
	public void setSenha(String password) {
		super.setPassword(password);
	}

}
