package daos;

import entities.Product;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by msi on 2016-04-04.
 * Implementacja DAO dla encji Product
 */

@Transactional
public class ProductDaoImpl {

    @PersistenceContext
    private EntityManager em;

    public Long save(Product product) {
        em.persist(product);
        return product.getIdProduct();
    }

    public List<Product> getAll(){
        return em.createQuery("SELECT p FROM Product p").getResultList();
    }
}
