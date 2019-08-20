/**
 * 
 */
package construtor;

/**
 * @author ctis
 *
 */
public class Conta {

	// Atributos
	private String titular;
	private int numero;
	private double saldo;
	private int identificador;

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	// Construtor com parametros
	public Conta(String titular) {
		this.titular = titular;
	}

	// Construtor sem parametro

	public Conta() {
		super();
	}

	// Getters Setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [titular: " + titular + ", numero: " + numero + ", saldo: " + saldo + "]";
	}

}
