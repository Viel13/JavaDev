package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_NAC_LIVRO")
@SequenceGenerator(name="seqLivro", sequenceName="SQ_T_NAC_LIVRO", allocationSize=1)
public class Livro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqLivro")
	@Column(name="NR_ISBN", length=50)
	private int isbn;
	
	@Column(name="DS_TITULO", nullable=false, length=200)
	private String titulo;
	
	@Lob
	private byte[] capa;
	
	@JoinColumn(name="CD_EDITORA")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Editora editora;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="T_NAC_AUTOR_LIVRO", joinColumns=@JoinColumn(name="NR_ISBN"), 
	inverseJoinColumns=@JoinColumn(name="CD_AUTOR"))
	private List<Autor> autores = new ArrayList<>();

	

	public Livro(int isbn, String titulo, byte[] capa, List<Autor> autores) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.capa = capa;
		this.autores = autores;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public byte[] getCapa() {
		return capa;
	}

	public void setCapa(byte[] capa) {
		this.capa = capa;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	
	

}
