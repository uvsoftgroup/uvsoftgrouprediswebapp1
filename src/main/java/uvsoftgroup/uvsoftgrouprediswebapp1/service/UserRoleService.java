/**
 * 
 */
package uvsoftgroup.uvsoftgrouprediswebapp1.service;

import java.util.List;
import org.springframework.stereotype.Service;
import uvsoftgroup.uvsoftgrouprediswebapp1.model.UserRole;

/**
 * @author A.Riaydh
 *
 */
@Service
public interface UserRoleService {
	public List<UserRole> listAll();
}
