package org.icm.vo;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.icm.abstracao.Pessoa;

//@MappedSuperclass
public class MembroVO extends Pessoa {
	
	@Column(name = "BI", nullable = false)
	private String bi;
	
	public String getBI() {
		return bi;
	}

	public void setBI(String bI) {
		bi = bI;
	}

}
