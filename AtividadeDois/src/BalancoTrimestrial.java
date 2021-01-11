/**
 * 
 */

/**
 * @author ctis
 *
 */
public class BalancoTrimestrial {
	
	public static void main(String[] args) {
		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		
		int gastoTrimestrial = gastoJaneiro + gastoFevereiro + gastoMarco;
		float media = (gastoTrimestrial/3);
		
		// imprimindo o resultado
		System.out.println("Gasto Trimestrial = " + gastoTrimestrial);
		System.out.printf("%s %.2f\n","Media",media);
		
		System.out.printf("Valor da media mensal = " + media);
	}

}
