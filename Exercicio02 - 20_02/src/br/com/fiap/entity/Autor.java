package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_AUTOR")
@SequenceGenerator(name="seqAutor", sequenceName="SQ_AUTOR", allocationSize=1)
public class Autor {
	
	@Id
	@Column(name = "id_autor")
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator = "seqAutor")
	private int id;
	
	@Column(name = "nm_autor", nullable=false, length = 255)
	private String nome;
	
	@Column(name="DS_SABOR")
	private Sexo sexo;
	 
	@Column(name = "nm_sobrenome", nullable = false, length = 300)
	private String sobrenome;
	
	@Column (name = "dt_nascimneto")
	private Calendar dt_nascimento;

	public Autor(int id, String nome, Sexo sexo, String sobrenome, Calendar dt_nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.sobrenome = sobrenome;
		this.dt_nascimento = dt_nascimento;
	}
	
	public Autor(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
	
	
	
	
}
