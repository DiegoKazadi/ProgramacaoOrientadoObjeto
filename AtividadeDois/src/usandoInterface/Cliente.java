/**
 * 
 */
package usandoInterface;

/**
 * @author ctis
 *
 */
public class Cliente implements Autenticavel{

	private int senha;
	
	private String cpf;
	private String nome;
	private double valor;
	
	
	
	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

	
	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		if (this.senha != senha) {
			System.out.println("Acesso negado! ");
			return false;
		}
		System.out.println("Seja Bem Vindo! ");
		return true;
	}


	@Override
	public String toString() {
		return "Cliente [" + "nome: " + nome + ", cpf: " + cpf + ", valor: " + valor + "]";
	}


}
