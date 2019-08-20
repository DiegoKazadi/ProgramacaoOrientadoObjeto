/**
 * 
 */

/**
 * @author ctis
 *
 */
public class Exercicios {
	
	public static void main(String[] args) {
		
		int numero = 150;
		while (numero < 300) {
			System.out.printf("%s %d"," Imprimindo numero de 150 até 300\n ",numero);
			numero += 1;
		} System.out.println(" Ultimo numero " + numero);
		
		// Multiplos de 3 entre 1 a 100
		for (int i = 0; i <= 100; i++) {
			int multiplos = i;
			if(i % 3 == 0) {
				System.out.println("Multiplos de 3 eh " + multiplos );
			}
		}
		// Factorial
		int fatorial = 4;
		for (int i = 1; i <= 10000; i++) {
			fatorial = i*(i-1) * (i-2);
			System.out.printf("%s %d %s %s \n", "O fatorial de ",i,"é", fatorial);
		}

		int valor = 1;
		while(valor < 20) {
		
			if (valor%2 == 0) {
				valor = valor/2;
			}else if(valor %3 ==1) {
				valor = (3*valor) + 1;
			}
			System.out.printf("O valor é de ", valor);
			valor +=1;
		}
		
		
		
		
	}

}
