package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
@SequenceGenerator(name="seqProduto", sequenceName="sq_tb_produto", allocationSize=1)
public class Produto {

	@Id
	@Column(name="CD_PRODUTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqProduto")
	private int cod;
	
	@Column(name="NM_PRODUTO")
	private String nome;
	
	@Column(name="VL_PRODUTO")
	private float valorP;

	public Produto( String nome, float valorP) {
		super();
		
		this.nome = nome;
		this.valorP = valorP;
	}
	
	
	
	public Produto(){
		
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

	public float getValorP() {
		return valorP;
	}

	public void setValorP(float valorP) {
		this.valorP = valorP;
	}
	
	
}
