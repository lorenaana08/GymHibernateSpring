package org.sda.gymhibernatespring;

import java.util.List;

import org.sda.gymhibernatespring.dao.entity.ClientEntity;

import org.sda.gymhibernatespring.service.ClientService;
import org.sda.gymhibernatespring.service.impl.ClientServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppController {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("database.xml");
		ClientService clientService = applicationContext.getBean(ClientService.class);
		List<ClientEntity> clients = clientService.getAllclients();

		for (ClientEntity clientEntity : clients) {
			System.out.println(clientEntity.getFirstName() + " " + clientEntity.getLastName());
		}

	}
}
