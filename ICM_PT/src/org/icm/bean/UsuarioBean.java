package org.icm.bean;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.icm.ejb.UserService;
import org.icm.utils.NavigationRules;
import org.icm.vo.UsuarioVO;

@Named("usuarioBean")
@RequestScoped
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class UsuarioBean extends UsuarioVO {
	
	//@Inject
	private UserService userValidation;
	
	public UsuarioBean() {
		
	}
	
	public String validation() {
		try {
			if (userValidation == null) {
				Context ctx = new InitialContext();
				userValidation = (UserService) ctx.lookup("java:global/ICM_EAR_Tutorial/ICM_EJB/UserServiceBean!org.icm.ejb.UserService");
			}
			
			if (userValidation.validar((UsuarioVO) this)) {
				return NavigationRules.LOGIN;
			}
			//throw new ValidationException();
		} catch (Throwable t) {
			System.err.println("Erro Grave no Login");
			t.printStackTrace();
		}
		
		return NavigationRules.LOGIN_ERROR;
	}

}
