package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="seqEsp", sequenceName="SQ_TB_ESPECIALIDADE", allocationSize=1)
@Table(name="TB_ESPECIALIDADE")
public class Especialidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqEsp")
	@Column(name="CD_ESPECIALIDADE")
	private int codigo;
	
	@Column(name="NM_ESPECIALIDADE", nullable=false)
	private String nome;
	
	@Column(name="DS_sexo")
	private Sexo sexo;
	
	@Column(name="DS_ESPECIALIDADE")
	private String descricao;

	@ManyToMany(mappedBy="especialidades")
	private List<Medico> medicos;
	
	
	
	public Especialidade(String nome, Sexo sexo, String descricao, List<Medico> medicos) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.descricao = descricao;
		this.medicos = medicos;
	}
	
	public Especialidade(){
		super();
	}
	
	

	public List<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
