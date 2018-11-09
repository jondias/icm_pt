package org.icm.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.icm.abstracao.Pessoa;
import org.icm.entity.MembroEntity;
import org.icm.vo.MembroVO;;

//@Stateless
public class MembroServiceBean implements MembroService {
	
	@PersistenceContext
    private EntityManager em;
	
	@Override
	public boolean salvar(Pessoa pessoa) {
		
		boolean result = Boolean.FALSE;
		try {
			if (pessoa instanceof MembroVO) {
				MembroEntity membro = new MembroEntity();
				membro.convertTo(pessoa);
				em.persist(membro);
				result = Boolean.TRUE;
			} else {
				//throw new ValidationException();
			}
		} catch (Throwable t) {
			System.out.println("Erro inesperado: ");
			t.printStackTrace();
		}
		return result;
		
	}

}
