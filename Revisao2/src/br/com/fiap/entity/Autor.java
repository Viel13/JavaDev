package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_NAC_AUTOR")
@SequenceGenerator(name="seqAutor", sequenceName="SQ_T_NAC_AUTOR", allocationSize=1)
public class Autor {
	
	@Id
	@Column(name="CD_AUTOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqAutor")
	private int codigo;
	@Column(name="NM_AUTOR", nullable=false, length=150)
	private String nome;
	@Temporal(TemporalType.DATE)
	private Calendar dtaNascimento;
	
	@ManyToMany(mappedBy="autores")
	private List<Livro> livros;
	
	

	public Autor(String nome, Calendar dtaNascimento) {
		super();
		this.nome = nome;
		this.dtaNascimento = dtaNascimento;
	}
	
	public Autor(){
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDtaNascimento() {
		return dtaNascimento;
	}

	public void setDtaNascimento(Calendar dtaNascimento) {
		this.dtaNascimento = dtaNascimento;
	}
	
	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	

}
