/**
 * 
 */
package coonceitoPolimorfismo;

/**
 * @author diego
 *
 */
public abstract class Animal {
	
	// atributos
	private float peso;
	private int idade;
	private int membros;
	
	// métodos abstratos
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}
	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * @return the membros
	 */
	public int getMembros() {
		return membros;
	}
	/**
	 * @param membros the membros to set
	 */
	public void setMembros(int membros) {
		this.membros = membros;
	}
		
}
