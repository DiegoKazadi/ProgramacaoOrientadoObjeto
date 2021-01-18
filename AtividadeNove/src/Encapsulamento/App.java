/**
 * 
 */
package Encapsulamento;

/**
 * @author diego
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();
		c.desligarMudo();
		c.play();
		c.abrirMenu();

	}

}
