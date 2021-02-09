/**
 * 
 */
package conceitoPolimorfismo;

/**
 * @author diego
 *
 */
public class Cachorro extends Mamifero {
	
	
		// m�todos de Cahorro
		public void enterrarOsso() {
			System.out.println("... ");
		}
		
		public void reagir(String frase) {
			if (frase.equals("Vem comer") || frase.equals("Olha comida")) {
				System.out.println("Abanar e Latir");
			}else {
				System.out.println("Rosnar");
			}
		}
		
		public void reagir(boolean dono) {
			if (dono) {
				System.out.println("Abanar e Latir");
			}else {
				System.out.println("Ignorar");
			}
		}
		
		public void reagir(int idade, float peso) {
			if (idade < 2 & peso <= 10.0) {
				System.out.println("Sentar");
			}else {
				System.out.println("Abanar e Latir");
			}
			
		}
		
		
		@Override
		public void emitirSom() {
			System.out.println("Au! Au! Au!");
		}
		

}
