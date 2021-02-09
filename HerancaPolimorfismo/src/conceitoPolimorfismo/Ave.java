/**
 * 
 */
package conceitoPolimorfismo;

/**
 * @author diego
 *
 */
public class Ave extends Animal{
	// atributos
	private String corPena;
	
	/**
	 * @return the corPena
	 */
	public String getCorPena() {
		return corPena;
	}

	/**
	 * @param corPena the corPena to set
	 */
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		System.out.println("Ave se locomove voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Ave se alimenta comendo frutas");
	}
	public void fazerNinho() {
		System.out.println("Construir um ninho");
	}

	@Override
	public void emitirSom() {
		
	}
}
