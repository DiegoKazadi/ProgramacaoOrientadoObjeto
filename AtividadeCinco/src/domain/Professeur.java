/**
 * 
 */
package domain;

/**
 * @author ctis
 *
 */
public class Professeur extends Funcionario{
	
	private String titulacao;
	private final String TITULACAO_GRADUADO = "Graduado";
	private final String TITULACAO_MESTRE = "mestre";
	private final String TITULACAO_DOUTOR = "Doutor";

	
	
	public String getTITULACAO_GRADUADO() {
		return TITULACAO_GRADUADO;
	}

	public String getTITULACAO_MESTRE() {
		return TITULACAO_MESTRE;
	}

	public String getTITULACAO_DOUTOR() {
		return TITULACAO_DOUTOR;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Professeur [titulacao=" + titulacao + "]";
	}
	

}
