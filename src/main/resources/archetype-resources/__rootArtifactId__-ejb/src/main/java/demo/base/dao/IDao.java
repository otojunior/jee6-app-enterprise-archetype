/**
 * 
 */
package demo.base.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import demo.base.entity.IEntity;

/**
 * @author Oto
 *
 */
public interface IDao<E extends IEntity> extends Serializable {
	public Number countAll();
	public List<E> findAll();
	public EntityManager getEntityManager();
	public void persist(E entity); 
}
