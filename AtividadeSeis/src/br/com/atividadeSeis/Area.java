/**
 * 
 */
package br.com.atividadeSeis;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author diego
 *
 */
public class Area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// definindo atributos
		double xA, xB, xC, yA, yB, yC;
		
		
		System.out.println("Digite a medida para o triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite as medidas para o triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		//calculando a area X
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		// calculando a area Y
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		
		//imprimindo os resultados
		System.out.printf("Triangulo X sua area: %.4f%n", areaX);
		System.out.printf("Triangulo Y sua area: %.4f%n", areaY);
		
		//comparando as duas areas
		if (areaX > areaY) {
			System.out.println("A maior area eh: X");
		}else {
			System.out.println("A maior area eh: Y");
		}
		
		sc.close();

	}

}
