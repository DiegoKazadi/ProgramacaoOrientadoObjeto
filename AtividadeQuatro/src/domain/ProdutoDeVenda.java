/**
 * 
 */
package domain;

/**
 * @author ctis
 *
 */
public class ProdutoDeVenda {
	
	protected String nome;
	protected double preco;
	
	
	public ProdutoDeVenda(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		System.out.println("Produto Para Consumir no Local");
		return String.format("-"+ nome + "R$"+ "%.2f", preco) ;
	}

}
