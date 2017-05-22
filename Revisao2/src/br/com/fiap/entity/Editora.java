package br.com.fiap.entity;

import java.util.ArrayList;
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
@SequenceGenerator(name="seqEditora", sequenceName="SQ_T_NAC_EDITORA", allocationSize=1)
@Table(name="T_NAC_EDITORA")
public class Editora {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqEditora")
	@Column(name="CD_EDITORA")
	private int codigo;
	
	@Column(name="NM_EDITORA", nullable=false)
	private String nome;
	
	@OneToMany(mappedBy="editora", cascade=CascadeType.PERSIST)
	private List<Livro> livros = new ArrayList<>();
	
	public void addLivro(Livro livro){
		livros.add(livro);
		livro.setEditora(this);
		
	}

	
	
	public Editora(String nome) {
		super();
		this.nome = nome;
		
	}



	public Editora(){
		
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

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	
	
	
	
	

}
