/**
 * 
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ctis
 *
 */
public class Cardapio {

	ProdutoDeConsumo produtoDeConsumo = new ProdutoDeConsumo(null, 0);
	ProdutoComValidade produtoComValidade =  new ProdutoComValidade(null, 0, null);
	
	
	List<ProdutoDeVenda> listaProdutoDeVenda = new ArrayList<ProdutoDeVenda>();
	
	public ProdutoDeConsumo getProdutoDeConsumo() {
		return produtoDeConsumo;
	}


	public void setProdutoDeConsumo(ProdutoDeConsumo produtoDeConsumo) {
		this.produtoDeConsumo = produtoDeConsumo;
	}


	public ProdutoComValidade getProdutoComValidade() {
		return produtoComValidade;
	}


	public void setProdutoComValidade(ProdutoComValidade produtoComValidade) {
		this.produtoComValidade = produtoComValidade;
	}


	public List<ProdutoDeVenda> getProdutoDeVenda() {
		return listaProdutoDeVenda;
	}
	public void setProdutoDeVenda(List<ProdutoDeVenda> produtoDeVenda) {
		this.listaProdutoDeVenda = produtoDeVenda;
	}
	
	public void adicionaProdutoDeVenda(ProdutoDeVenda produto) {
		
		if(listaProdutoDeVenda.contains(produto)) {
			System.out.println("O produto existe!");
		}
		listaProdutoDeVenda.add(produto);
	}
	public void deletaProdutoDeVenda(ProdutoDeVenda produto) {
		listaProdutoDeVenda.remove(produto);
	}
	
	public void listarProdutos() {
		for (ProdutoDeVenda produtoDeVenda : listaProdutoDeVenda) {
			System.out.println(produtoDeVenda);
		}
	}

}
