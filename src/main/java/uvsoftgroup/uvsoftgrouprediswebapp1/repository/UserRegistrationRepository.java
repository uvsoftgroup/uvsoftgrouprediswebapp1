/**
 * 
 */
package uvsoftgroup.uvsoftgrouprediswebapp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uvsoftgroup.uvsoftgrouprediswebapp1.model.UserRegistration;

/**
 * @author A.Riaydh
 *
 */
@Repository
public interface UserRegistrationRepository extends CrudRepository<UserRegistration, String> {

}
