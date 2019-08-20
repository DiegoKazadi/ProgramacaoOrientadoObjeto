/**
 * 
 */
package herancaPolimorfismo;

/**
 * @author ctis
 *
 */
public class Gerente extends Funcionario{
	
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permition! ");
			return true;
			
		} else {
			System.out.println("Acesso Negado! ");
			return false;
		}
	}
	public double getBonificacao() {
		return this.salario * 0.15;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	@Override
	public String toString() {
		return "Gerente [nome: " + nome + ", cpf: " + cpf + ", salario: " + salario + ", "
				+ "numeroDeFuncionariosGerenciados: " + numeroDeFuncionariosGerenciados + "]";
	}
	
	
}
