package br.ifsp.livraria.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.ifsp.livraria.entidades.Editora;

public class TesteInsereEditora {

	public static void main(String[] args) {

		try{
			EntityManagerFactory factory =  
					Persistence.createEntityManagerFactory("livraria");
			

			EntityManager em = factory.createEntityManager();
			
			Editora ed = new Editora();
			ed.setNome("Editora Ática");
			ed.setEmail("contato@atica.com.br");
			
			em.getTransaction().begin();
			
			em.persist(ed);
			
			em.getTransaction().commit();
			
			em.close();
			
			factory.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

}
