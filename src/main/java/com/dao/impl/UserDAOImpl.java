package com.dao.impl;

import com.dao.UserDAO;
import com.model.entities.User;
import com.model.entities.User_;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * @author leyla
 * @since 10.06.17
 */
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Long getCountByName(String name) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = cb.createQuery(Long.class);
        Root<User> root = criteria.from(User.class);
        criteria.select(cb.count(root.get(User_.id)));
        criteria.where(cb.equal(root.get(User_.name), name));
        return em.createQuery(criteria).getSingleResult();
    }

    @Override
    public void save(User user) {
        em.merge(user);
    }

    @Override
    public User getById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void delete(User user) {
        if(user != null) {
            em.remove(em.contains(user) ? user : em.merge(user));
        }
    }
}
