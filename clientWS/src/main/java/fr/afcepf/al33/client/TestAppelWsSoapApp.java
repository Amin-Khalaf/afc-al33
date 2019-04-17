package fr.afcepf.al33.client;

import fr.afcepf.al33.client.delegate.ConvertisseurDelegate;
import fr.afcepf.al33.client.delegate.ConvertisseurDelegateRest;

public class TestAppelWsSoapApp {

	
    //à lancer via Run as / java application
	public static void main(String[] args) {
		 
		
		ConvertisseurDelegate convertisseurDelegate 
		= new ConvertisseurDelegateRest();
		//= new ConvertisseurDelegateSoap();
		double montantConverti = 
				convertisseurDelegate.convertir(50, "EUR", "USD");
		System.out.println("montantConverti="+montantConverti);
		/*	
		System.out.println("15 euros=" + 
					convertisseurDelegate.euroToFranc(15.0));
			System.out.println("auteur=" + convertisseurDelegate.getAuteur());
		*/
	}

}
