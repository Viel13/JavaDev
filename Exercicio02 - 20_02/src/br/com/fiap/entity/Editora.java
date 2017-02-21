package br.com.fiap.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="TB_EDITORA")
@SequenceGenerator(name="seqEditora", sequenceName="SQ_TB_EDITORA", allocationSize=1)
public class Editora {
	@Id
	@Column(name = "id_editora")
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator="seqEditora")
	private int id;
	
	@Column(name = "nr_cnpj", nullable = false)
	private int cnpj;
	
	@Column(name = "nm_editora", nullable = false)
	private String nome;
	
	@Column(name = "endereco")
	private String endereço;

	public Editora(int id, int cnpj, String nome, String endereço) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereço = endereço;
	}
	
	public Editora (){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	

	
	
}
