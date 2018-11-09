package org.icm.ejb;

import javax.ejb.Remote;

import org.icm.vo.UsuarioVO;

@Remote
public interface UserService {
	
	public boolean validar(UsuarioVO user);

}
