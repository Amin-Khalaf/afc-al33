package fr.afcepf.al33.tp.test;

import fr.afcepf.al33.tp.dao.ProduitDaoJpa;

public class TestSingletonApp {

	public static void main(String[] args) {
		
		ProduitDaoJpa produitDao = null; 
		
		//v�rifier new direct interdit si constructeur priv� 
		//dans classe ProduitDaoJpa
		//produitDao = new ProduitDaoJpa();
		
		// cr�er une instance via un appel � .getInstance()
		produitDao = ProduitDaoJpa.getInstance();
		
		//appeler la m�thode .toString() sur l'unique instance r�cup�r�e
		
		System.out.println(produitDao.toString());

	}

}
