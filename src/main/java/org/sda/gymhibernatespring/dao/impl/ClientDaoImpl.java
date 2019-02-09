package org.sda.gymhibernatespring.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.sda.gymhibernatespring.dao.ClientDao;
import org.sda.gymhibernatespring.dao.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDaoImpl implements ClientDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveClient(ClientEntity client) {

	}

	@Override
	public List<ClientEntity> getAllClients() {
		Query query = sessionFactory.getCurrentSession().createQuery("from ClientEntity");

		return query.list();

	}

}
