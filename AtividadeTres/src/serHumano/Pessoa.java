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
		System.out.println("Uma pessoa da ra�a " + this.raca);
		System.out.println("A cor dela �: " + this.cor);
		System.out.println("Seu genero " + this.sexo);
		System.out.println("O nome dela �: " + this.nome);
		System.out.println("Ela est� viva: " + this.viva);
		
	}
	public void andar( ) {
		if (this.viva == true) {
			System.out.println(this.nome + " anda");
		}else {
			System.out.println(this.nome + " est� morta, n�o pode andar");
		}
		
	}
	
	public void seAlimentar() {
		if (this.viva == true || this.comer == true) {
			System.out.println(this.nome + " se alimenta bem e est� saudavel");
			
		}else {
			System.out.println(this.nome + " est� morta e n�o pode comer");
		}
		
	}
		
	public void comer() {
		this.comer = true;
	}
	
	public void naoComer() {
		this.comer = false;
	}
	
	
	

}
