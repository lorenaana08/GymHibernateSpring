package org.sda.gymhibernatespring.dao;

import java.util.List;

import org.sda.gymhibernatespring.dao.entity.ClientEntity;

public interface ClientDao {
	public void saveClient(ClientEntity client);

	public List<ClientEntity> getAllClients();

}
