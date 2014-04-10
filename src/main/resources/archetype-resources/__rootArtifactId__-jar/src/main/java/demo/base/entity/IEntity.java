/**
 * 
 */
package demo.base.entity;

import java.io.Serializable;

/**
 * @author Oto
 *
 */
public interface IEntity extends Serializable {
	public Long getId();
	public Long getVersion();
}
