/**
 * 
 */
package contas;

import java.util.Date;

import interfa.Pagavel;

/**
 * @author ctis
 *
 */
public class Conta implements Pagavel {
	
	private double valor;
	private Date vencimento;
	private String codigo;
	
	private double valorUnitario = 35.0;
	private double valorApagar = 0.0;
	

	
	public void setValorApagar(double valorApagar) {
		this.valorApagar = valorApagar;
	}

	
	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}



	public Date getVencimento() {
		return vencimento;
	}



	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public double pagarConta(double consumo) {
		if(consumo < 10 ) {
			this.valorApagar = valorUnitario;
			
		}else if(consumo > 10) {
			this.valorApagar = (valorUnitario * 5.0 *consumo);  
		}
		return this.valorApagar;
	}


	@Override
	public void getValorApagar() {
		// TODO Auto-generated method stub
		
	}

	
}
