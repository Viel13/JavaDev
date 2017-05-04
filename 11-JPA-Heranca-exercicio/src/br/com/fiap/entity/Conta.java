package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CONTA")
@IdClass(ContaPK.class)
@Inheritance(strategy=InheritanceType.JOINED)
public class Conta {
	
	@Id
	@Column(name="NR_CONTA")
	@SequenceGenerator(name="seqConta", sequenceName="SQ_TB_CONTA", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqConta")
	private int codConta;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="NR_AGENCIA")
	private Agencia agencia;
	
	@Column(name="VL_SALDO", nullable=false)
	private double saldo;

	
	
	

	public Conta(Agencia agencia, double saldo) {
		super();
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public Conta(){}

	public int getCodConta() {
		return codConta;
	}

	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	

	
}
