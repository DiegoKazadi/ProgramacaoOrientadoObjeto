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
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<ProdutoDeVenda> lista = new ArrayList<ProdutoDeVenda>();
		ProdutoDeConsumo produtoDeConsumo = new ProdutoDeConsumo("Filé com Arroz", 12);
		ProdutoDeConsumo pdc = new ProdutoDeConsumo("Macaxeira Frita com Ovos Mexidos", 15.0);
		ProdutoDeConsumo outro = new ProdutoDeConsumo("Arroz a Grega e Feijão Macassar", 9);		
		
		
		ProdutoComValidade lista2 =  new ProdutoComValidade("Pacote de Amedoin", 3, "12/04/2019");
		
		lista.add(produtoDeConsumo);
		lista.add(pdc);
		lista.add(outro);
		lista.add(lista2);
		System.out.println(produtoDeConsumo.toString());
		System.out.println(outro.toString());
		System.out.println(pdc.toString());
		System.out.println(lista.toString());
		
	}
	
	
}
