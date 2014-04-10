package demo.crud.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import demo.base.dao.ApplicationDaoTest;
import demo.crud.entity.CrudEntity;

/**
 * 
 * @author Oto
 *
 */
public class CrudDaoTest extends ApplicationDaoTest<CrudDao> {
	/**
	 * {@inheritDoc}
	 */
	@Before
	public void setUp() throws Exception {
		setDao(new CrudDao());
		super.setUp();
	}
	
	/**
	 * 
	 */
	@Test
	public void testCountAll() {
		populate();
		Number countAll = getDao().countAll();
		assertEquals(20, countAll.intValue());
	}

	/**
	 * 
	 */
	@Test
	public void testFindAll() {
		populate();
		List<CrudEntity> all = getDao().findAll();
		assertEquals(20, all.size());
	}
	
	/**
	 * 
	 */
	@Test
	public void testPersist() {
		final int n = 20; 
		for (int i = 0; i < n; i++) {
			CrudEntity c = new CrudEntity();
			c.setStringProperty("Crud Entity Reg. " + i);
			c.setIntegerProperty(i);
			c.setDateProperty(new Date());
			getDao().persist(c);
		}
		List<CrudEntity> all = getDao().findAll();
		assertEquals(20, all.size());
	}
	
	/**
	 * 
	 */
	private void populate() {
		final int n = 20; 
		for (int i = 0; i < n; i++) {
			CrudEntity c = new CrudEntity();
			c.setStringProperty("Crud Entity Reg. " + i);
			c.setIntegerProperty(i);
			c.setDateProperty(new Date());
			getDao().getEntityManager().persist(c);
		}
	}
}
