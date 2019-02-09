package org.sda.gymhibernatespring.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.sda.gymhibernatespring.dao.ClientDao;
import org.sda.gymhibernatespring.dao.entity.ClientEntity;
import org.sda.gymhibernatespring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDao clientDao;

	public ClientDao getClientDao() {
		return clientDao;
	}
	
	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public void saveClient(ClientEntity clientEntity) {
		clientDao.saveClient(clientEntity);

	}

	@Transactional
	public List<ClientEntity> getAllclients() {

		return clientDao.getAllClients();
	}

}
