package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_TECNICO")
@SequenceGenerator(name="seqTec", sequenceName="SQ_TB_TECNICO", allocationSize=1)
public class Tecnico {

	@Id
	@Column(name="CD_TECNICO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqTec")
	private int codtec;
	@Column(name="NM_TECNICO")
	private String nome;

	public Tecnico(int codtec, String nome) {
		super();
		this.codtec = codtec;
		this.nome = nome;
	}
	
	public Tecnico(){}

	public int getCodtec() {
		return codtec;
	}

	public void setCodtec(int codtec) {
		this.codtec = codtec;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
