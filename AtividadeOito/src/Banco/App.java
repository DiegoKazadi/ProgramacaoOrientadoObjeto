/**
 * 
 */
package Banco;

/**
 * @author diego
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setNumConta("153-45");
		c1.setDono("Diego");
		c1.abrirConta("CC");
		
		Conta c2 = new Conta();
		c2.setNumConta("219-54");
		c2.setDono("Armiliana");
		c2.abrirConta("CP");
		
		c1.depositar(1000);
		c2.depositar(3000);
		
		c1.fecharConta();
		c2.pagarMensalidade();
		
		c1.estadoAtual();
		c2.estadoAtual();
	}

}
