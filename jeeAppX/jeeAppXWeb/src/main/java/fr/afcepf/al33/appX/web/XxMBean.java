package fr.afcepf.al33.appX.web;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.afcepf.al33.appX.service.ServiceXx;
import fr.afcepf.al33.appY.delegate.MyConvRestDelegate;
import fr.afcepf.al33.conv.Convertisseur;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ManagedBean
@SessionScoped
@Getter @Setter @NoArgsConstructor
public class XxMBean {
	
	private Double montantEuro=15.0;
	private Double montantFranc;
	
	private Double montantSource=100.0;
	private Double montantCible;
	private String codeMonnaieSource="EUR";
	private String codeMonnaieCible="USD";

	@EJB
	private ServiceXx serviceXx;
	
	private Convertisseur convertisseur = MyConvRestDelegate.getInstance();
	
	public String doEuroToFranc() {
		this.montantFranc = serviceXx.euroToFranc(this.montantEuro);
		return null;
	}
	
	public String doConversion() {
		this.montantCible = convertisseur.convertir(this.montantSource,
				         codeMonnaieSource, codeMonnaieCible);
		return null;
	}
	
}
