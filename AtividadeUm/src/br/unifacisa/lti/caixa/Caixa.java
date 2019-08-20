/**
 * 
 */
package br.unifacisa.lti.caixa;

import java.math.BigDecimal;

/**
 * @author ctis
 *
 */
public class Caixa {
	
	private BigDecimal saldo;
	private BigDecimal valor;
	
	/**
	 * 
	 */
	public Caixa() {
		super();
		this.saldo = new BigDecimal (0.00);
	}

	/**
	 * @return the saldo
	 */
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	public boolean registraEntrada(BigDecimal valor) {
		return true;
	}
	public boolean registraSaida(BigDecimal valor) {
		return true;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return this.valor;
	}

	/**
	 * @param valor2 the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Caixa [saldo=" + saldo + ", valor=" + valor + "]";
	}
	

}
