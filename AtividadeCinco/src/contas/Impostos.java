/**
 * 
 */
package contas;

import java.util.Date;

/**
 * @author ctis
 *
 */
public class Impostos extends Conta{
	
	private Date vencimento;

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	@Override
	public String toString() {
		return "Impostos [vencimento=" + vencimento + "]";
	}

}
