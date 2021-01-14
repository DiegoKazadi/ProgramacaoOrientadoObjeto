/**
 * 
 */
package Banco;

/**
 * @author diego
 *
 */
public class Conta {
	
	
	public String numConta;
	
	protected String tipo;
	
	private String dono;
	
	private double saldo;
	
	private boolean status;

	/**
	 * @param numConta
	 * @param tipo
	 * @param dono
	 * @param saldo
	 */
	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	/**
	 * @return the numConta
	 */
	public String getNumConta() {
		return numConta;
	}

	/**
	 * @param numConta the numConta to set
	 */
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the dono
	 */
	public String getDono() {
		return dono;
	}

	/**
	 * @param dono the dono to set
	 */
	public void setDono(String dono) {
		this.dono = dono;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the status
	 */
	public boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	/**
	 * @metodos personalizados
	 */
	public void estadoAtual() {
		System.out.println("-----------------------------");
		System.out.println("Número de conta " + this.getNumConta());
		System.out.println("Tipo de conta " + this.getTipo());
		System.out.println("Dono(a) " + this.getDono());
		System.out.println("Saldo atual: " + "R$" + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
		
	public void abrirConta(String tip) {
		this.setTipo(tip);
		this.setStatus(true);
		
		if ("CC".equals(tip)) {
			this.setSaldo(50);
		}else if ("CP".equals(tip)){
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso! ");
	}
	
	public void fecharConta() {
		
		if (this.getSaldo() > 0) {
			System.out.println("A conta não pode ser fechada pois, possuiu dinheiro");
			
		}else if(this.getSaldo() < 0) {
			System.out.println("A conta não pode ser fechada pois, está em débito");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
		
	}
	
	public void depositar(double valor) {
		
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + valor);
		
			System.out.println("Deposito realizado com sucesso na conta de " + this.getDono() + " o saldo é de: " + this.getSaldo());
		}else {
			System.out.println("Imposivel realizar deposito");
		}
		
	}
	
	public void sacar(double valor) {
		if (this.getStatus() == true) {
		
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				
				System.out.println("Saque realizado na conta de " + this.getDono()  + " o saldo é de: " + this.getSaldo());
			}else {
			System.out.println("Saldo insuficiente");
			
			}
		}else {
			System.out.println("Impossivél sacar na conta fechada ");
		}
		
	}
	
	public void pagarMensalidade () {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;			
		} else if(this.getTipo() == "CP"){
			v = 20;
			
		}else {
			
		}
		if  (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade da conta de " + this.getDono() + "paga com sucesso! ");

		}else {
			System.out.println("Impossivelpagar uma conta fechada");
		}
		
	}
}
