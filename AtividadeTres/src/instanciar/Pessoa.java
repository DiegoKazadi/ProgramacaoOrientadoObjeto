/**
 * 
 */
package instanciar;

/**
 * @author diego
 *
 */
public class Pessoa {
	
	// uso da palavras de visibilidade dos atributos 
	public String cor;
	public String sexo;
	private String raca;
	private String nome;
	private boolean viva;
	private boolean comer;
	
	
	// os metodos da classe pessoa, o que a pessoa pode fazer ou faz
	
	public void status() {
		System.out.println("Uma pessoa da raça " + this.raca);
		System.out.println("A cor dela é: " + this.cor);
		System.out.println("Seu genero " + this.sexo);
		System.out.println("O nome dela é: " + this.nome);
		System.out.println("Ela está viva: " + this.viva);
		
	}
	public void andar( ) {
		if (this.viva == true) {
			System.out.println(this.nome + " anda");
		}else {
			System.out.println(this.nome + " está morta, não pode andar");
		}
		
	}
	
	public void seAlimentar() {
		if (this.viva == true || this.comer == true) {
			System.out.println(this.nome + " se alimenta bem e está saudavel");
			
		}else {
			System.out.println(this.nome + " está morta e não pode comer");
		}
		
	}
		
	protected void comer() {
		this.comer = true;
	}
	
	protected void naoComer() {
		this.comer = false;
	}
	
}
