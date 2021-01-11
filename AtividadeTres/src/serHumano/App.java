/**
 * 
 */
package serHumano;

/**
 * @author diego
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// instanciar a pessoa, criar um objeto
		Pessoa pessoa1 = new Pessoa();
		pessoa1.cor = "Preta";
		pessoa1.nome = "Luvila";
		pessoa1.raca = "Africana";
		pessoa1.sexo = "Masculino";
		pessoa1.viva = true;
		pessoa1.status();
		pessoa1.andar();
		pessoa1.naoComer();
		pessoa1.seAlimentar();
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.raca = "Asiatica";
		pessoa2.cor = "Amarelo";
		pessoa2.sexo = "Feminino";
		pessoa2.nome = "Lee Oun";
		pessoa2.viva = false;
		pessoa2.status();
		pessoa2.andar();
		pessoa2.naoComer();
		pessoa2.seAlimentar();
	}

}
