package br.ifsp.livraria.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.ifsp.livraria.entidades.Editora;

public class TesteBuscaEditoras {
	

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("livraria");

			EntityManager manager = factory.createEntityManager();

			int id = 1;

			Editora ed = manager.find(Editora.class, id);

			System.out.println("EDITORA: " + ed.getNome() + " - " + ed.getEmail ());

			manager.close();

			factory.close();
	}
}
