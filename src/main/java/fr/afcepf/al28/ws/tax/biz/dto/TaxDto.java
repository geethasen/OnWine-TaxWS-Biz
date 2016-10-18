package fr.afcepf.al28.ws.tax.biz.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace="http://dto.biz.tax.ws.al28.afcepf.fr")
@XmlRootElement(name="taxDto")
public class TaxDto implements Serializable {

	/**
	 * Serialization Id.
	 */
	private static final long serialVersionUID = 1L;
	
	private String codePays;

	private String nomPays;
	
	private Double tva;

	public String getCodePays() {
		return codePays;
	}

	public void setCodePays(String codePays) {
		this.codePays = codePays;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public Double getTva() {
		return tva;
	}

	public void setTva(Double tva) {
		this.tva = tva;
	}

	public TaxDto(String codePays, String nomPays, Double tva) {
		super();
		this.codePays = codePays;
		this.nomPays = nomPays;
		this.tva = tva;
	}

	public TaxDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TaxDto [codePays=" + codePays + ", nomPays=" + nomPays + ", tva=" + tva
				+ "]";
	}
	
}
