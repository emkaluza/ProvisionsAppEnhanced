package daos;

import entities.Unit;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by msi on 2016-04-04.
 * Implementacja DAO dla encji Unit
 */

@Transactional
public class UnitDaoImpl {

    @PersistenceContext
    private EntityManager em;

    public Long save(Unit unit) {
        em.persist(unit);
        return unit.getIdUnit();
    }

    public List<Unit> getAll(){
        return em.createQuery("SELECT u FROM Unit u", Unit.class).getResultList();
    }
}
