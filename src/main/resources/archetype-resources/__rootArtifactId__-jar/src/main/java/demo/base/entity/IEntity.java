/**
 * 
 */
package demo.base.entity;

import java.io.Serializable;

/**
 * Entity Interface
 * @author [Author Name]
 *
 */
public interface IEntity extends Serializable {
	public Long getId();
	public Long getVersion();
}
