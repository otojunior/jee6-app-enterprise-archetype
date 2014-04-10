package ${package};

import java.util.List;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 
 */
@Model
public class SampleManagedBean {
	private static final Logger LOG = LoggerFactory.getLogger(SampleManagedBean.class);
	
	public String sampleAction() {
		LOG.info("Managed Bean Action Performed!");
		return null;
	}
}
