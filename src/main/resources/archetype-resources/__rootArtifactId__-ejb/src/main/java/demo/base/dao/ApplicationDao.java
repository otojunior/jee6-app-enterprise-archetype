package demo.base.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import demo.base.entity.ApplicationEntity;

/**
 * Application DAO.
 * @author [Author Name]
 *
 */
public abstract class ApplicationDao<E extends ApplicationEntity> implements IDao<E> {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="default")
	private EntityManager entityManager;
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationDao.class);
	
	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * @param entityManager the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	@Override
	public void persist(E entity) {
		getEntityManager().persist(entity);
		
	}
}
