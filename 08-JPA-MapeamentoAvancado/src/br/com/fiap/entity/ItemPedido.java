package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "ITEM_PEDIDO")
@IdClass(ItemPedidoPK.class)
public class ItemPedido {

	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_PRODUTO")
	private Produto produto;
	@Id
	@ManyToOne
	@JoinColumn(name="CD_PEDIDO")
	private Pedido pedido;
	
	@Column(name="QD_ITEM")
	private int quantidade;

	public ItemPedido(Produto produto, Pedido pedido, int quantidade) {
		super();
		this.produto = produto;
		this.pedido = pedido;
		this.quantidade = quantidade;
	}
	
	public ItemPedido(){
		
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
