package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_DISCIPLINA")
@SequenceGenerator(name="seqDisciplina", sequenceName="SQ_TB_DISCIPLINA", allocationSize=1)
public class Disciplina {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqDisciplina")
	@Column(name="cod_disc")
	private int codigo;
	@Column(name="nm_disc", length=200)
	private String nome;
		@Column(name="ch_disc")
	private float cargaHoraria;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="TB_ALUNO_DISCIPLINA" , joinColumns=@JoinColumn(name="FK_CD_DISCIPLINA"), 
	inverseJoinColumns=@JoinColumn(name="FK_RM"))
	private List<Aluno> alunos;

	public Disciplina( String nome, float cargaHoraria) {
		super();
		
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		
	}
	
	public Disciplina(){}

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

	public float getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(float cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
}
