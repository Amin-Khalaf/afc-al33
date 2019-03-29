package fr.afcepf.al33.tp.service;

import javax.annotation.PostConstruct;

import fr.afcepf.al33.tp.dao.DaoClient;
import fr.afcepf.al33.tp.entity.Client;

public class ServiceClientImpl implements ServiceClient {
	
	private DaoClient daoClient;//null tout au debut avant injection dependance
	
	//methode d'injection de d�pendance appel�e par spring
	public void setDaoClient(DaoClient daoClient) {
		this.daoClient = daoClient;
	}
	
	public ServiceClientImpl() {
		System.out.println("dans constructeur , daoClient inutilisable=" +daoClient );
	}
	
	@PostConstruct //OK avec EJB, JSF, Spring, ...
	public void initQueJaime() {
		//m�thode appel�e apr�s toutes les injections effectu�es 
		System.out.println("dans m�thode prefix�e par @PostConstruct , daoClient=" +daoClient );
	}

	@Override
	public Client rechercherClientParNum(Long num) {
		return daoClient.findById(num);
	}

	@Override
	public void sauvegarderClient(Client c) {
		daoClient.save(c);
        //...
	}

}
