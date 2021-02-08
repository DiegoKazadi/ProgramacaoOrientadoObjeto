/**
 * 
 */
package coonceitoPolimorfismo;

/**
 * @author diego
 *
 */
public class Mamifero extends Animal{
	// atributo de mamifero
	private String corPelo;
	
	/**
	 * @return the corPelo
	 */
	public String getCorPelo() {
		return corPelo;
	}

	/**
	 * @param corPelo the corPelo to set
	 */
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Mamifero se locomove correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}
	public void emitirSom() {
		System.out.println("Emite som de mamifero");
	}
}
