/**
 * 
 */

/**
 * @author diego
 *
 */
public class ProgramaPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		
		// com os atributos comuns herdados
		p1.setNome("Clive");
		p2.setNome("Chabrel");
		p3.setNome("Crise");
		
		p1.setSexo("Masculino");
		p2.setSexo("Masculino");
		p3.setSexo("masculino");
		
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
