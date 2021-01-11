/**
 * 
 */
package usandoAtalhos;

/**
 * @author ctis
 *
 */
public class Contas {

	// Atributos
	private String titular;
	private double saldo;
	private int numero;
	private String agencie;

	public void deposita(double valor) {
		this.saldo = valor;

	}

	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente! ");
		}

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencie() {
		return agencie;
	}

	public void setAgencie(String agencie) {
		this.agencie = agencie;
	}

	@Override
	public String toString() {
		return "Contas [titular: " + titular + ", saldo: " + saldo + ", numero: " + numero + ", agencie:" + agencie
				+ "]";
	}

}
