package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_AGENCIA")
@SequenceGenerator(name="seqAgencia", sequenceName="SQ_TB_AGENCIA", allocationSize=1)
public class Agencia {
	
	@Id
	@Column(name="NR_AGENCIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqAgencia")
	private int nrAgencia;
	@Column(name="DS_ENDERECO")
	private String endere�o;
	@OneToMany(mappedBy="agencia", cascade=CascadeType.PERSIST)
	private List<Conta> contas;

	
	
	public Agencia(String endere�o) {
		super();
		this.endere�o = endere�o;
	}

	public Agencia(){
		
	}

	public int getNrAgencia() {
		return nrAgencia;
	}

	public void setNrAgencia(int nrAgencia) {
		this.nrAgencia = nrAgencia;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	
}
