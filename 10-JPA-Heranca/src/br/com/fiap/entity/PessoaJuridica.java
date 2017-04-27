package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TB_PESSOA_JURIDICA")
//@DiscriminatorValue(value="J")
@PrimaryKeyJoinColumn(name="cd_pessoa")
public class PessoaJuridica extends Pessoa{
	
	@Column(name="cnpj")
	private String cnpj;
	@Column(name="nm_fantasia")
	private String nomeFantasia;

	
	
	public PessoaJuridica(String nome, String email, String cnpj, String nomeFantasia) {
		super(nome, email);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public PessoaJuridica(){
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	
	
}
