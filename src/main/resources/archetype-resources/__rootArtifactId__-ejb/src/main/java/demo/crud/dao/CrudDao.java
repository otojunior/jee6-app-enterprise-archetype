/**
 * 
 */
package demo.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import demo.base.dao.ApplicationDao;
import demo.crud.entity.CrudEntity;

/**
 * @author Oto
 *
 */
public class CrudDao extends ApplicationDao<CrudEntity> {
	private static final long serialVersionUID = 1L;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Number countAll() {
		EntityManager em = getEntityManager();
		TypedQuery<Number> query = em.createNamedQuery(CrudEntity.COUNT_ALL, Number.class);
		return query.getSingleResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CrudEntity> findAll() {
		EntityManager em = getEntityManager();
		TypedQuery<CrudEntity> query = em.createNamedQuery(CrudEntity.FIND_ALL, CrudEntity.class);
		return query.getResultList();
	}

	
}
