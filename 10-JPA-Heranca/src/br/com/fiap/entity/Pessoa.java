package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PESSOA")
@SequenceGenerator(name="seqPessoa", sequenceName="SQ_TB_PESSOA", allocationSize=1)
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="TIP_PESSOA", discriminatorType=DiscriminatorType.STRING)
public class Pessoa {
	
	@Id
	@Column(name="cd_pessoa")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqPessoa")
	private int cod;
	
	@Column(name="nm_pessoa")
	private String nome;
	
	@Column(name="ds_pessoa")
	private String email;

	public Pessoa(String nome, String email) {
		super();
		
		this.nome = nome;
		this.email = email;
	}
	
	public Pessoa(){
		
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
