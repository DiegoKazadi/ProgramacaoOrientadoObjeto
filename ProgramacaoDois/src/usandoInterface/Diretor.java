/**
 * 
 */
package usandoInterface;

/**
 * @author ctis
 *
 */
public class Diretor extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		if(this.senha != senha) {
			return false;
			
		}
		return true;
	}

}
