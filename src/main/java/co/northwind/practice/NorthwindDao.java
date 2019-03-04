package co.northwind.practice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class NorthwindDao {
	@PersistenceContext
	private EntityManager em;

	public List<Supplier> findAll() {
		
		return em.createQuery("FROM Supplier", Supplier.class).getResultList();
	}
}
