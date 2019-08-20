/**
 * 
 */
package domain;


/**
 * @author ctis
 *
 */
public class ProdutoDeConsumo extends ProdutoDeVenda{
	private String receita;
	
	public ProdutoDeConsumo(String receita, double preco) {
		super(receita, preco);
		this.receita = receita;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	@Override
	public String toString() {
		return String.format("- " + receita + " - " + "R$"+ "%.2f",preco);
	}
	
}
