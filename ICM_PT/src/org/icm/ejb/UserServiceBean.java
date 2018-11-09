package org.icm.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.icm.vo.UsuarioVO;

//@Stateful
public class UserServiceBean implements UserService {
	
	@PersistenceContext
    private EntityManager em;
	
	private UsuarioVO usuario;

	public boolean validar(UsuarioVO user) {
		
		boolean result = Boolean.FALSE;
		try {
			/*usuario = em.find(UsuarioEntity.class, user.getUser());
			if (usuario!=null && usuario.getPassword().equals(user.getPassword())) {
				return (Boolean.TRUE);
			}*/
			result = Boolean.TRUE;
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return result;
	}

}
