package conceitoHeranca;

/**
 * 
 */

/**
 * @author diego
 *
 */
public class Aluno extends Pessoa{
	// atributos
	private int matr;
	private String curso;
	
	public void estudar() {
		System.out.println("O aluno est� na sala de aula!");
	}
	
	public void fazerProva() {
		System.out.println("O aluno fez a prova");
	}

	/**
	 * @return the matr
	 */
	public int getMatr() {
		return matr;
	}

	/**
	 * @param matr the matr to set
	 */
	public void setMatr(int matr) {
		this.matr = matr;
	}

	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
