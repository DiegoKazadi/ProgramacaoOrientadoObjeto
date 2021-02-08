/**
 * 
 */

/**
 * @author diego
 *
 */
public class Professor extends Pessoa{
	// atributos
	
	private String disciplina;
	private double salario;
	
	
	
	public void aplicarProvar() {
		System.out.println("Prova aplicada!");
	}
	
	public void corrigirProva() {
		System.out.println("Realizando as correções...");
	}
	
	public void receberSalario (double aum) {
		this.setSalario(this.salario += aum);
		System.out.println("Seu saldo é de : " + this.getSalario());
	}
	/**
	 * @return the disciplina
	 */
	public String getDisciplina() {
		return disciplina;
	}

	/**
	 * @param disciplina the disciplina to set
	 */
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
