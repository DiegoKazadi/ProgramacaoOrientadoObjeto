/**
 * 
 */
package metodos;

/**
 * @author diego
 *
 */
public class App {
	
	public static void main(String[] agrs) {
		
		
		// instanciar caneta
		Caneta c1 = new Caneta();
		
		//atribuir alor no objeto
		c1.modelo = ("BIC");
		c1.setPonta(0.5f);
		
		System.out.println("Minha caneta " + c1.getModelo());
		System.out.println("Tem uma ponta de " + c1.getPonta());
		c1.status();
		
		System.out.println("---");
		
		// instanciar outra caneta
		Caneta c2 = new Caneta();
		c2.setPonta(0.6f);
		c2.setModelo("Special");
		
		System.out.println("Minha caneta " + c2.getModelo());
		System.out.println("Tem uma ponta de  " + c2.getPonta());
		c2.status();
		
		System.out.println("---"); 
		
		// criando instanciar com metodo construtor
		Caneta c3 = new Caneta("Palst","Azul", 0.9f);
		c3.status();
		
	}

}
