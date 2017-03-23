package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CAMPEONATO")
@SequenceGenerator(name="seqCam", sequenceName="SQ_TB_CAMPEONATO", allocationSize=1)
public class Campeonato {
	@Id
	@Column(name="CD_CAMPEONATO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqCam")
	private int codC;
	@Column(name="NM_CAMPEONATO")
	private String nome;
	
	public Campeonato(int codC, String nome) {
		super();
		this.codC = codC;
		this.nome = nome;
	}
	
	public Campeonato(){
		
	}

	public int getCodC() {
		return codC;
	}

	public void setCodC(int codC) {
		this.codC = codC;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
