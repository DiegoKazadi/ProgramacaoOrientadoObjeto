/**
 * 
 */
package usandoAtalhos;

/**
 * @author ctis
 *
 */
public class Main {

	public static void main(String[] args) {

		// instanciar a conta
		Contas conta = new Contas();

		conta.setNumero(1234);
		conta.setSaldo(2879.00);
		conta.setTitular("Angeline");
		conta.setAgencie("14-4849-0");

		conta.deposita(1000);

		System.out.println(conta.toString());

	}

}
