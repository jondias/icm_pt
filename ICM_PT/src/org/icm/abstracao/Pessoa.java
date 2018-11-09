package org.icm.abstracao;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.TableGenerator;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


//@MappedSuperclass
public abstract class Pessoa {
	
	@TableGenerator(
		    name="pessoa_id",
		    table="PERSISTENCE_ORDER_SEQUENCE_GENERATOR",
		    pkColumnName="GEN_KEY",
		    valueColumnName="GEN_VALUE",
		    pkColumnValue="VENDOR_PART_ID",
		    allocationSize=10)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="pessoa_id")
	@Column(name = "PESSOAID", updatable = false, nullable = false)
	private Integer pessoaid;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "APELIDO", nullable = false)
	private String apelido;
	
	public Integer getPessoaid() {
		return pessoaid;
	}
	public void setPessoaid(Integer pessoaid) {
		this.pessoaid = pessoaid;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

}
