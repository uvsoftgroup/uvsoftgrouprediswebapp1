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
import uvsoftgroup.uvsoftgrouprediswebapp1.service.UserRegistrationService;
import uvsoftgroup.uvsoftgrouprediswebapp1.model.UserRegistration;

/**
 * @author A.Riaydh
 *
 */
@RestController
@RequestMapping("/userRegistration")
public class UserRegistrationController {
private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
    private UserRegistrationService userRegistrationService;
    
    public UserRegistrationController(
			UserRegistrationService userRegistrationService) {
		super();
		this.userRegistrationService = userRegistrationService;
	}

	public UserRegistrationController() {
        System.out.println("UserRegistrationController");
    }
     
	
	@RequestMapping(value="/findAll", method = RequestMethod.GET)
    List<UserRegistration> findAll() {
        return userRegistrationService.listAll();
    }
}
