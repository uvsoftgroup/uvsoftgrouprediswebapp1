package uvsoftgroup.uvsoftgrouprediswebapp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uvsoftgroup.uvsoftgrouprediswebapp1.model.UserRole;

/**
 * @author A.Riaydh
 *
 */
@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, String> {
	

}
