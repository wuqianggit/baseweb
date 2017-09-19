package spittr.persistence;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spittr.domain.Spitter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * spittr.persistence
 *
 * 2017/9/19-21:09
 * 2017
 * Created by wuqiang on 2017/9/19.
 */
@Repository
@Transactional
public class JpaSpitterRepository implements SpitterRepository{

    @PersistenceContext//注入EntityManager
    private EntityManager em;

    @Override
    public void addSpitter(Spitter spitter) {
        em.persist(em);
    }
    @Override
    public Spitter getSpitterById(Integer id) {
        Spitter spitter = em.find(Spitter.class, id);
        return spitter;
    }
}
