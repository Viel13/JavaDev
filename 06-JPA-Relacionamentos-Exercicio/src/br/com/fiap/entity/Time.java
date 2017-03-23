package br.com.fiap.entity;

import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="TB_TIME")
@SequenceGenerator(name="seqTime", sequenceName="SQ_TB_TIME", allocationSize=1)
public class Time {
	@Id
	@Column(name="CD_TIME")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqTime")
	private int codT;
	
	@Column(name="NM_TIME")
	private String nomeT;
	@Column(name="DT_FUNDACAO")
	@Temporal(TemporalType.DATE)
	private Calendar dt_fundacao;
	
	@Column(name="NR_TITULO")
	private int nr_titulo;
	
	@OneToMany(mappedBy="time", cascade=CascadeType.PERSIST)
	private List<Jogador> jogadores;
	
	
	private Tecnico tec;

	public Time(int codT, String nomeT, Calendar dt_fundacao, int nr_titulo, Tecnico tec) {
		super();
		this.codT = codT;
		this.nomeT = nomeT;
		this.dt_fundacao = dt_fundacao;
		this.nr_titulo = nr_titulo;
		this.tec = tec;
	}
	
	public Time(){
		
	}

	public int getCodT() {
		return codT;
	}

	public void setCodT(int codT) {
		this.codT = codT;
	}

	public String getNomeT() {
		return nomeT;
	}

	public void setNomeT(String nomeT) {
		this.nomeT = nomeT;
	}

	public Calendar getDt_fundacao() {
		return dt_fundacao;
	}

	public void setDt_fundacao(Calendar dt_fundacao) {
		this.dt_fundacao = dt_fundacao;
	}

	public int getNr_titulo() {
		return nr_titulo;
	}

	public void setNr_titulo(int nr_titulo) {
		this.nr_titulo = nr_titulo;
	}

	public Tecnico getTec() {
		return tec;
	}

	public void setTec(Tecnico tec) {
		this.tec = tec;
	}
	
	
	
}
