/**
 * 
 */
package br.unifacisa.lti.empresa;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.unifacisa.lti.caixa.Caixa;

/**
 * @author ctis
 *
 */
public class Empresa {
	
	
	private String nome;
	private String cnpj;
	private int numeroVendas;
	private BigDecimal media;
	private Date data;
	
	private Caixa caixa;
	
	private final BigDecimal EMPRESA_SAUDAVEL = new BigDecimal(100000); 
	private final BigDecimal EMPRESA_ESTAVEL = new BigDecimal(50.000);
	private BigDecimal EMPRESA_EM_RISCO = new BigDecimal(49.99999);
	private final BigDecimal EMPRESA_DEFICITARIA = new BigDecimal (-1);
	
	public Empresa(String nome, String cnpj, Caixa caixa) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.caixa = caixa;
	}
	
	public void validaCnpj(String cnpj) {
		
		if(cnpj.length() == 18) {
			System.out.println("Valido!");
		}else { 
			System.out.println("Não valido!!!");
		}
	}
	
	public String getDataIniciAtuacao() {
		Date data = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/AAAA - HH:MM:SS. ");
		String strData = formatter.format(data);
		
		return strData;
		
	}
	public void getSaldoFormato() {
		System.out.printf("R$ .2f",caixa.getSaldo());
	}
	
	public String classificandoEmpresa() {
		if(empresaSaudavel()) {
			System.out.println("Empresa Saúdxavel");
		}else if(empresaEmRisco()) {
			System.out.println("Empresa e Risco");
		}else if(empresaEstavel()) {
			System.out.println("Empresa Saudavél");
		}else if(empresaDeficitaria()) {
				System.out.println("Empresa Deficitaria");
		}
		return null;
	}
	
	public boolean empresaSaudavel() {
		return caixa.getSaldo().compareTo(EMPRESA_SAUDAVEL) > 0;
	}
	public boolean empresaEmRisco() {
		return caixa.getSaldo().compareTo(EMPRESA_EM_RISCO) < 0; 
	}
	public boolean empresaEstavel() {
		return caixa.getSaldo().compareTo(EMPRESA_ESTAVEL) >= 1;
	}
	public boolean empresaDeficitaria() {
		return caixa.getSaldo().compareTo(EMPRESA_DEFICITARIA) == -1 ;
		
	}
	
	public void realizaVenda(BigDecimal valor) {
		caixa.setValor(valor);
		this.numeroVendas += 1;
	}
	
	public void realizaCompra(BigDecimal valor) {
		int teste = caixa.getSaldo().compareTo(valor);
		
		if(teste > 0) {
			System.out.println("Saldo suficiente!");
			caixa.registraSaida(valor);
		}else {
			System.out.println("Saldo insuficiente!");	
		}
		
	}
	public BigDecimal mediaDeVendas() {
		BigDecimal media = (caixa.getSaldo().divide(new BigDecimal(numeroVendas)));
		return media;
	}
	
	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * @return the media
	 */
	public BigDecimal getMedia() {
		return media;
	}

	/**
	 * @param media the media to set
	 */
	public BigDecimal setMedia(BigDecimal media) {
		return this.media = (media);
	}

	/**
	 * @return the numeroVendas
	 */
	public int getNumeroVendas() {
		return numeroVendas;
	}

	/**
	 * @param numeroVendas the numeroVendas to set
	 */
	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}

	/**
	 * @return the caixa
	 */
	public Caixa getCaixa() {
		return caixa;
	}

	/**
	 * @param caixa the caixa to set
	 */
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the eMPRESA_SAUDAVEL
	 */
	public BigDecimal getEMPRESA_SAUDAVEL() {
		return EMPRESA_SAUDAVEL;
	}

	/**
	 * @return the eMPRESA_ESTAVEL
	 */
	public BigDecimal getEMPRESA_ESTAVEL() {
		return EMPRESA_ESTAVEL;
	}

	/**
	 * @return the eMPRES_EM_RISCO
	 */
	public BigDecimal getEMPRES_EM_RISCO() {
		return EMPRESA_EM_RISCO;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cnpj=" + cnpj + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
