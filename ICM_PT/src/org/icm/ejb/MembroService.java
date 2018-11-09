package org.icm.ejb;

import javax.ejb.Remote;

import org.icm.abstracao.Pessoa;

@Remote
public interface MembroService {

	public boolean salvar(Pessoa pessoa);

}