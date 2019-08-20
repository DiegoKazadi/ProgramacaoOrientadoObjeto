/**
 * 
 */
package domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ctis
 *
 */
public class Funcionario {
	
	private String nome;
	private double salario;
	private String tempoDeEmpresa;
	private String tempoDeServico;
	private double bonus = 0.01;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	// converção das datas
	DateFormat data = new SimpleDateFormat("dd/mm/yyyy");
	
	//Converte para data
	Date datatempo = data.parse(tempoDeEmpresa);
	Date tempo = data.parse(tempoDeServico);
	
	
	public String getTempoDeServico() {
		return tempoDeServico;
	}


	public void setTempoDeServico(String tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		if (tempoDeEmpresa.compareTo(tempoDeServico)) {
		getSalarioComBonus();
		}
		return salario;
	}
	public double getSalarioComBonus() {
		return this.salario = (salario * (bonus / 100));
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTempoDeEmpresa() {
		return tempoDeEmpresa;
	}


	public void setTempoDeEmpresa(String tempoDeEmpresa) {
		this.tempoDeEmpresa = tempoDeEmpresa;
	}

	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
