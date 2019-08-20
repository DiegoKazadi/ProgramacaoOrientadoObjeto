/**
 * 
 */
package construtor;

/**
 * @author ctis
 *
 */
public class Main {

	public static void main(String[] args) {

		// Instaceando
		Conta contaUm = new Conta("Alexia");
		contaUm.setNumero(123);
		contaUm.setSaldo(15.000);
		// Imprimir no console
		System.out.println("Nome do Titular: " + contaUm.getTitular());
		System.out.println(contaUm.toString());
	}

}
