package com.Aakash.pojos;

// Generated Aug 17, 2015 2:47:43 AM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class QuestionChoices.
 * @see com.Aakash.pojos.QuestionChoices
 * @author Hibernate Tools
 */
@Stateless
public class QuestionChoicesHome {

	private static final Log log = LogFactory.getLog(QuestionChoicesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(QuestionChoices transientInstance) {
		log.debug("persisting QuestionChoices instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(QuestionChoices persistentInstance) {
		log.debug("removing QuestionChoices instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public QuestionChoices merge(QuestionChoices detachedInstance) {
		log.debug("merging QuestionChoices instance");
		try {
			QuestionChoices result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public QuestionChoices findById(Integer id) {
		log.debug("getting QuestionChoices instance with id: " + id);
		try {
			QuestionChoices instance = entityManager.find(
					QuestionChoices.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
