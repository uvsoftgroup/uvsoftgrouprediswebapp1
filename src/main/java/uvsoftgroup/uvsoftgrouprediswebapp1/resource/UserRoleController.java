/**
 * 
 */
package uvsoftgroup.uvsoftgrouprediswebapp1.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uvsoftgroup.uvsoftgrouprediswebapp1.model.UserRole;
import uvsoftgroup.uvsoftgrouprediswebapp1.service.UserRoleService;

/**
 * @author A.Riaydh
 *
 */
@RestController
@RequestMapping("/userRole")
public class UserRoleController {
private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
    private UserRoleService userRoleService;
    
    public UserRoleController(UserRoleService userRoleService) {
		super();
		this.userRoleService =userRoleService;
	}

	public UserRoleController() {
        System.out.println("UserRegistrationController");
    }
     
	
	@RequestMapping(value="/findAll", method = RequestMethod.GET)
    List<UserRole> findAll() {
        return userRoleService.listAll();
    }
}
