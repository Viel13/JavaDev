package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_JOGADOR")
@SequenceGenerator(name="seqJog", sequenceName="SQ_TB_JOGADOR", allocationSize=1)
public class Jogador {
	@Id
	@Column(name="CD_JOGADOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqJog")
	private int cod;
	@Column(name="NM_JOGADOR")
	private String nome;
	@ManyToOne
	@JoinColumn(name="CD_TIME")
	private Time time;
	
	public Jogador(int cod, String nome, Time time) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.time = time;
	}
	
	public Jogador(){
		
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

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
	
	
}
