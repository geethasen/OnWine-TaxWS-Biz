package fr.afcepf.al28.ws.tax.biz.api;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.jws.WebService;

import fr.afcepf.al28.ws.tax.biz.dto.TaxDto;
import fr.afcepf.al28.ws.tax.exception.TaxWSException;

@WebService()
public interface ServiceTax {
	
	public TaxDto rechercherTax(@WebParam(name="codePays")String codePays) throws TaxWSException;

	public Double calculTax(@WebParam(name="montant")double montant,
			                @WebParam(name="tva")double tva)
	                        throws TaxWSException;
}