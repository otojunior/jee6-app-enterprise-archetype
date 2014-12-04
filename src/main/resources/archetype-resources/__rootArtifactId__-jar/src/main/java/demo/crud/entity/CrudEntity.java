package demo.crud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import demo.base.entity.ApplicationEntity;

/**
 * Example Entity
 * @author [Author Name]
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name=CrudEntity.COUNT_ALL, query="select count(c) from CrudEntity c"),
	@NamedQuery(name=CrudEntity.FIND_ALL, query="select c from CrudEntity c")
})
public class CrudEntity extends ApplicationEntity {
	private static final long serialVersionUID = 1L;

	public static final String COUNT_ALL = "queryCrudEntityCountAll";
	public static final String FIND_ALL = "queryCrudEntityFindAll";
	
	@NotNull
	@Column(length=20, unique=true, nullable=false)
	private String stringProperty;
	
	@NotNull
	@Column(nullable=false)
	private Integer integerProperty;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateProperty;

	/**
	 * @return the stringProperty
	 */
	public String getStringProperty() {
		return stringProperty;
	}

	/**
	 * @param stringProperty the stringProperty to set
	 */
	public void setStringProperty(String stringProperty) {
		this.stringProperty = stringProperty;
	}

	/**
	 * @return the integerProperty
	 */
	public Integer getIntegerProperty() {
		return integerProperty;
	}

	/**
	 * @param integerProperty the integerProperty to set
	 */
	public void setIntegerProperty(Integer integerProperty) {
		this.integerProperty = integerProperty;
	}

	/**
	 * @return the dateProperty
	 */
	public Date getDateProperty() {
		return dateProperty;
	}

	/**
	 * @param dateProperty the dateProperty to set
	 */
	public void setDateProperty(Date dateProperty) {
		this.dateProperty = dateProperty;
	}
}
