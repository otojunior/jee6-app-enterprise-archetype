package demo.base.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import demo.base.entity.IEntity;

/**
 * DAO Interface.
 * @author [Author Name]
 *
 */
public interface IDao<E extends IEntity> extends Serializable {
	public Number countAll();
	public List<E> findAll();
	public EntityManager getEntityManager();
	public void persist(E entity); 
}
