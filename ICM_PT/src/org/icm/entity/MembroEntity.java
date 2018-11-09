package org.icm.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.icm.vo.MembroVO;

//@Entity
//@Table(name="APP.PESSOA")
public class MembroEntity extends MembroVO {

	public void convertTo(Object pessoa) {
		if(pessoa instanceof MembroVO) {
			MembroVO membro = (MembroVO) pessoa;
			this.setPessoaid(membro.getPessoaid());
			this.setBI(membro.getBI());
			this.setNome(membro.getNome());
			this.setApelido(membro.getApelido());
		}
		
	}
	

}
