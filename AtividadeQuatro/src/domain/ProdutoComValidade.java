/**
 * 
 */
package domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ctis
 *
 */
public class ProdutoComValidade extends ProdutoDeVenda{

	private String validade;
	private int quantidade;
	
	
	public ProdutoComValidade(String nome, double preco, String validade) {
		super(nome, preco);
		
	}
	public String converterData (String validade) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf.parse(validade);
		return sdf.format(data);
		
	}
	
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public static void main(String[] args) {
		
		ProdutoComValidade pcv = new ProdutoComValidade("Arroz com feijão", 15.0, "22/05/2019");
		System.out.println(pcv.toString());
	}
}
