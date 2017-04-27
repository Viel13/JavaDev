package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PESSOA_FISICA")
//@DiscriminatorValue(value="F")
@PrimaryKeyJoinColumn(name="cd_pessoa")
public class PessoaFisica extends Pessoa {

	@Column(name = "cpf_pessoa")
	private String cpf;

	@Column(name = "sx_pessoa")
	private Sexo sexo;

	public PessoaFisica( String nome, String email, String cpf, Sexo sexo) {
		super(nome,email);
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}
