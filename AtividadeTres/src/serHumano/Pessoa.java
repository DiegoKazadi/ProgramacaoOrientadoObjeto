/**
 * 
 */
package serHumano;

/**
 * @author diego
 *
 */
public class Pessoa {
	
	// os atributos da classe pessoa
	String cor;
	String sexo;
	String raca;
	String nome;
	boolean viva;
	boolean comer;
	
	
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
		
	public void comer() {
		this.comer = true;
	}
	
	public void naoComer() {
		this.comer = false;
	}
	
	
	

}
