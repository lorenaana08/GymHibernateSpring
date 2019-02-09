package org.sda.gymhibernatespring.service;

import java.util.List;

import org.sda.gymhibernatespring.dao.ClientDao;
import org.sda.gymhibernatespring.dao.entity.ClientEntity;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {


	public void saveClient(ClientEntity clientEntity);

	public List<ClientEntity> getAllclients();

}
