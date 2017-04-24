package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_FUNCIONARIO")
@SecondaryTable(name="TAB_DADO_FUNCIONARIO")
@SequenceGenerator(name="seqFuncionario", sequenceName="SQ_T_FUNCIONARIO", allocationSize=1)
public class Funcionario {

	@Id
	@Column(name="CD_FUNCIONARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqFuncionario")
	private int cod;
	@Column(name="NM_FUNCIONARIO", nullable=false)
	private String nome;
	@Column(name="DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	@OneToMany(mappedBy="funcionario", cascade=CascadeType.PERSIST)
	private List<Dependente> dependentes;
	@Column(name="VL_SALARIO", table="TAB_DADO_FUNCIONARIO")
	private double salario;
	@Column(name="NR_CONTA", table="TAB_DADO_FUNCIONARIO")
	private int conta;
	@Column(name="NR_AGENCIA", table="TAB_DADO_FUNCIONARIO")
	private int  agencia; 
	


	
	
	public Funcionario(int cod, String nome, Calendar dataNascimento, double salario,
			int conta, int agencia) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		
		this.salario = salario;
		this.conta = conta;
		this.agencia = agencia;
	}

	public Funcionario(){
		
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

	public Calendar getDataFunc() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	
	
}
