package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CONTA")
@SequenceGenerator(name="seqConta", sequenceName="SQ_TB_CONTA", allocationSize=1)
@Inheritance(strategy=InheritanceType.JOINED)

public class Conta {
	
	@Id
	@Column(name="NR_AGENCIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqConta")
	private int codAgencia;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="NR_AGENCIA")
	private Agencia agencia;
	
	@Column(name="VL_SALDO")
	private double saldo;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public Conta(){}

	public int getCodAgencia() {
		return codAgencia;
	}

	public void setCodAgencia(int codAgencia) {
		this.codAgencia = codAgencia;
	}

	public int getNrConta() {
		return getNrConta();
	}

	public void setNrConta(int nrConta) {
		this.nrConta = nrConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
