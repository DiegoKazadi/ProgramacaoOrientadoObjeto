/**
 * 
 */
package coonceitoPolimorfismo;

/**
 * @author diego
 *
 */
public class ProgamaPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// instânciar Mamifero
		Mamifero m = new Mamifero();
		Canguru cg = new Canguru();
		Cachorro ca = new Cachorro();
		
		//chamada de métodos
		m.locomover();
		cg.locomover();
		ca.locomover();
		ca.emitirSom();
		ca.setPeso(12);
		ca.setIdade(3);
		m.emitirSom();
		ca.reagir(true);
		ca.reagir("Olha comida");
				
	}

}
