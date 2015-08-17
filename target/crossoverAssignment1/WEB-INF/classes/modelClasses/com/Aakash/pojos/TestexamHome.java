package com.Aakash.pojos;

// Generated Aug 17, 2015 2:47:43 AM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Testexam.
 * @see com.Aakash.pojos.Testexam
 * @author Hibernate Tools
 */
@Stateless
public class TestexamHome {

	private static final Log log = LogFactory.getLog(TestexamHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Testexam transientInstance) {
		log.debug("persisting Testexam instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Testexam persistentInstance) {
		log.debug("removing Testexam instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Testexam merge(Testexam detachedInstance) {
		log.debug("merging Testexam instance");
		try {
			Testexam result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Testexam findById(Integer id) {
		log.debug("getting Testexam instance with id: " + id);
		try {
			Testexam instance = entityManager.find(Testexam.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
