package demo.base.dao;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public abstract class ApplicationDaoTest<DAO extends ApplicationDao<?>> {
	private static EntityManagerFactory factory;
	private DAO dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = Persistence.createEntityManagerFactory("test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory.close();
	}

	@Before
	public void setUp() throws Exception {
		dao.setEntityManager(factory.createEntityManager());
		dao.getEntityManager().getTransaction().begin();
	}

	@After
	public void tearDown() throws Exception {
		dao.getEntityManager().getTransaction().rollback();
		dao.getEntityManager().close();
	}

	@Test
	public void testGetEntityManager() {
		assertNotNull(dao.getEntityManager());
	}

	/**
	 * @return the dao
	 */
	public DAO getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(DAO dao) {
		this.dao = dao;
	}
}
