package demo.base.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application Entity
 * @author [Author Name]
 * 
 */
@MappedSuperclass
public abstract class ApplicationEntity implements IEntity {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationEntity.class);

	@Id
	@GeneratedValue
	private Long id;

	@Version
	private Long version;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationEntity other = (ApplicationEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public Long getVersion() {
		return version;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @param version
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
