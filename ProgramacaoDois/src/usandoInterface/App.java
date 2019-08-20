/**
 * 
 */
package usandoInterface;

/**
 * @author ctis
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		// Instaceanciar a class Engenheiro
		Engenheiro eng1 = new Engenheiro();
		Engenheiro eng2 = new Engenheiro();
		Diretor dir = new Diretor();
		Cliente clie = new Cliente();
		Gerente ger = new Gerente();
		
		
		// Aplicar os métodos
		eng1.setCpf("123456-12");
		eng1.setNome("Astride");
		eng1.setSalario(2314.500);
		
		eng2.setCpf("123456-98");
		eng2.setNome("Alexia");
		eng2.setSalario(3245.908);
		
		dir.setCpf("123456-78");
		dir.setNome("Angeline");
		dir.setSalario(1543.700);
		
		ger.setCpf("123456-65");
		ger.setNome("Pietro");
		ger.setSalario(3219.000);
		
		clie.setCpf("123456-34");
		clie.setNome("Manix");
		clie.setValor(2451.000);
		clie.setSenha(123);
		clie.autentica(123);
		
		// Exibir o banco
		System.out.println(eng1.toString());
		System.out.println(eng2.toString());
		
		System.out.println(clie.toString());
		System.out.println(ger.toString());
		System.out.println(dir.toString());
		
		
	}

}
