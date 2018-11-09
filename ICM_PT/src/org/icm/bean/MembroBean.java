package org.icm.bean;

import javax.ejb.EJB;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import org.icm.ejb.MembroService;
import org.icm.utils.NavigationRules;
import org.icm.vo.MembroVO;

@Named("membroBean")
@RequestScoped
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class MembroBean extends MembroVO {
	
	@EJB
	private MembroService membroService;
	
	public MembroBean () {
		
	}
	
	public String salvar() {
		try {
			/*if (membroService == null) {
				Context ctx = new InitialContext();
				membroService = (MembroService) ctx.lookup("java:global/ICM_EAR_Tutorial/ICM_EJB/MembroServiceBean!org.icm.ejb.MembroService");
			}
			
			MembroVO membroVo = new MembroVO();
			membroVo.setNome(this.getNome());
			membroVo.setApelido(this.getApelido());
			if (membroService.salvar(membroVo)) {
				return NavigationRules.WELCOME;
			}*/
			//throw new ValidationException();
		} catch (Throwable t) {
			System.err.println("Erro Grave no Login");
			t.printStackTrace();
		}
		
		return NavigationRules.WELCOME;
	}

}
