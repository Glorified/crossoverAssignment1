package com.Aakash.pojos;

// Generated Aug 17, 2015 2:47:43 AM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Questions.
 * @see com.Aakash.pojos.Questions
 * @author Hibernate Tools
 */
@Stateless
public class QuestionsHome {

	private static final Log log = LogFactory.getLog(QuestionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Questions transientInstance) {
		log.debug("persisting Questions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Questions persistentInstance) {
		log.debug("removing Questions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Questions merge(Questions detachedInstance) {
		log.debug("merging Questions instance");
		try {
			Questions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Questions findById(Integer id) {
		log.debug("getting Questions instance with id: " + id);
		try {
			Questions instance = entityManager.find(Questions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
