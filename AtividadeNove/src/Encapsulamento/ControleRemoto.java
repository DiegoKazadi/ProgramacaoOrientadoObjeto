/**
 * 
 */
package Encapsulamento;

/**
 * @author diego
 *
 */
public class ControleRemoto implements Controlador {
	
	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
		
	}
	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
	/**
	 * @return the ligado
	 */
	public boolean getLigado() {
		return ligado;
	}
	/**
	 * @param ligado the ligado to set
	 */
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	/**
	 * @return the tocando
	 */
	public boolean getTocando() {
		return tocando;
	}
	/**
	 * @param tocando the tocando to set
	 */
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	@Override
	public void ligar() {
		this.setLigado(true);
	}
	@Override
	public void desligar() {
		this.setLigado(false);
	}
	@Override
	public void abrirMenu() {
		System.out.println("----Ligar Menu----");
		System.out.println("Ligado " + this.getLigado());
		System.out.println("Tocando " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.println("[0]");
			
		}
	}
	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...!");
	}
	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Impossivél aumentar volume");
		}
	}
	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impossivél diminuir volume");
		}
	}
	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0 ) {
			this.setVolume(0);
		}
	}
	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0 ) {
			this.setVolume(50);
		}
	}
	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}else {
			System.out.println("Não consegui reproduzir");
		}
	}
	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Não consegui pausar");
		}
		
	}
	

}
