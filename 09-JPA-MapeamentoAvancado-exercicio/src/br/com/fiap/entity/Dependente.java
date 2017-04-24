package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DEPENDENTE")
@IdClass(DependentePK.class)

public class Dependente {

	@Id
	@Column(name="CD_DEPENDENTE")
	@SequenceGenerator(name="seqDependente", sequenceName="SQ_T_DEPENDENTE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqDependente")
	private int cod;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_FUNCIONARIO")
	private Funcionario funcionario;
	
	@Column(name="NM_DEPENDENTE", nullable=false)
	private String nome;

	public Dependente(int cod, Funcionario funcionario, String nome) {
		super();
		this.cod = cod;
		this.funcionario = funcionario;
		this.nome = nome;
	}
	
	public Dependente(){
		
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

