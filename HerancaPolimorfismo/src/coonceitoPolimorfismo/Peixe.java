/**
 * 
 */
package coonceitoPolimorfismo;

/**
 * @author diego
 *
 */
public class Peixe extends Animal {
	// atriubuto
	private String corEscama;
	
	/**
	 * @return the corEscama
	 */
	public String getCorEscama() {
		return corEscama;
	}

	/**
	 * @param corEscama the corEscama to set
	 */
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Peixe se locomove nadando na agua");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
		
	}
	
	public void  soltarBolha() {
		System.out.println("Bolhas grande");
	}

	@Override
	public void emitirSom() {
		
	}

}
