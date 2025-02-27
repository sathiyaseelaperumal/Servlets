package super_servlets.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import super_servlets.dto.ServletsDto;

public class ServletsDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sparky");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public String insert(ServletsDto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		return "data inserted";
		
	}
	
	public Object findbyId(int id)
	{
		ServletsDto sdto=entityManager.find(ServletsDto.class, id);
		if(sdto==null)
		{
			return "no data found";
		}
		else {
			return sdto;
		}
	
		
	}
	
	public String deleteById(int id)
	{
		ServletsDto sDto=entityManager.find(ServletsDto.class, id);
		if(sDto!=null)
		{
			entityTransaction.begin();
			entityManager.remove(sDto);
			entityTransaction.commit();
			return "data deleted";
		}
		else {
			return "no data";
		}
	}


	public List<ServletsDto> fetchAll()
	{
	// select ud_un from table_name ud _un--->JPQL	
	 Query q=entityManager.createQuery("select a from ServletsDto a");
	 List<ServletsDto> list=q.getResultList();
	 if(list.isEmpty())
	 {
		 return null;
	 }
	 else {
		 return list;
	 }
		
	}
	public String deleteAll() {
		//String ud_un from table_name ud _vn-->JPQL
		 Query q=entityManager.createQuery("select a from ServletsDto a");
		 List<ServletsDto> list=q.getResultList();
		 if(list.isEmpty())
		 {
			
			 return "no data found";
		 }
		 else {
			 for(ServletsDto s:list) 
			 {
				 entityTransaction.begin();
				 entityManager.remove(s);
				 entityTransaction.commit();
				 
			 }
			 
			 return "data deleted";

		 }
		 
	}
}
