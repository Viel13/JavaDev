package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PRODUTO")
@SequenceGenerator(name="seqPedido", sequenceName="sq_tb_pedido", allocationSize=1)
public class Pedido {
	
	@Id
	@Column(name="CD_PEDIDO")
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="seqPedido")
	private int cod;
	
	@Column(name="DT_PEDIDO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataPedido;
	
	@Column(name="NM_Cliente")
	private String nomeCliente;

	public Pedido(Calendar dataPedido, String nomeCliente) {
		super();
		this.dataPedido = dataPedido;
		this.nomeCliente = nomeCliente;
	}
	
	
	public Pedido(){
		
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public Calendar getDataPedido() {
		return dataPedido;
	}


	public void setDataPedido(Calendar dataPedido) {
		this.dataPedido = dataPedido;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
	
	
}
