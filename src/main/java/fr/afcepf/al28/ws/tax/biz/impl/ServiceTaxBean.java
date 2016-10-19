package fr.afcepf.al28.ws.tax.biz.impl;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import fr.afcepf.al28.ws.tax.biz.api.ServiceTax;
import fr.afcepf.al28.ws.tax.biz.dto.TaxDto;
import fr.afcepf.al28.ws.tax.dao.api.ITax;
import fr.afcepf.al28.ws.tax.entity.Tax;
import fr.afcepf.al28.ws.tax.exception.TaxWSException;

@Stateless
@WebService(endpointInterface="fr.afcepf.al28.ws.tax.biz.api.ServiceTax", targetNamespace = "http://tax.afcepf.fr")
public class ServiceTaxBean implements ServiceTax, Serializable {
	
	/**
	 * Serial Id.
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ITax daoTax;

	@Override
	public TaxDto rechercherTax(String codePays) throws TaxWSException {
		// TODO Auto-generated method stub
		Tax tax = daoTax.getTaxByCodePays(codePays);
		return entityToDto(tax);
	}
	
	public TaxDto entityToDto(Tax t) {
		return new TaxDto(t.getCodePays(), t.getNomPays(), t.getTva());
	}

	@Override
	public Double calculTax(double montant, double tva) throws TaxWSException {
		// TODO Auto-generated method stub
		return (montant*tva);
	}

}
