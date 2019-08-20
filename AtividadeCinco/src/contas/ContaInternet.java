/**
 * 
 */
package contas;

/**
 * @author ctis
 *
 */
public class ContaInternet extends Conta{
	
	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ContaInternet [valor=" + valor + "]";
	}
	
}
