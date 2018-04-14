/**
 * 
 */
package uvsoftgroup.uvsoftgrouprediswebapp1.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.redis.core.RedisHash;

/**
 * @author A.Riaydh
 *
 */
@RedisHash("UserRole")
public class UserRole implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id
	 private String id;
	private Long userRoleId;
	private String userRoleName;
	private String userRoleType;
	private Date userRoleDate;
	 
	 
	public UserRole() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
	public String getUserRoleType() {
		return userRoleType;
	}
	public void setUserRoleType(String userRoleType) {
		this.userRoleType = userRoleType;
	}
	public Date getUserRoleDate() {
		return userRoleDate;
	}
	public void setUserRoleDate(Date userRoleDate) {
		this.userRoleDate = userRoleDate;
	}
	@Override
	public String toString() {
		return "UserRole [id=" + id + ", userRoleId=" + userRoleId + ", userRoleName=" + userRoleName
				+ ", userRoleType=" + userRoleType + ", userRoleDate=" + userRoleDate + "]";
	}
	 
	 
	 
}
