/**
 * 
 */
package metodos;

/**
 * @author diego
 *
 */
public class Caneta {
	
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	/**
	 * @metodo construtor sem parametro
	 */
	public Caneta() {
		this.tampada();
		this.cor = "Vermelho";
		
	}
	
	/**
	 * @metodo construtor com parametro
	 */
	
	public Caneta(String modelo, String cor, float ponta) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.destampa();
	}
	
	
	// metodos
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	private void tampada() {
		this.tampada = true;
	}
	
	public void destampa() {
		this.tampada = false;
	}
	
	public void status() {
		
		System.out.println("Modelo: "  + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
}
