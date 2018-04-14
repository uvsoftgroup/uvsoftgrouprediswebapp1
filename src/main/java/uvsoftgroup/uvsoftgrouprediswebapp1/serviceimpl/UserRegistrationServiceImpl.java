package uvsoftgroup.uvsoftgrouprediswebapp1.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uvsoftgroup.uvsoftgrouprediswebapp1.model.UserRegistration;
import uvsoftgroup.uvsoftgrouprediswebapp1.repository.UserRegistrationRepository;
import uvsoftgroup.uvsoftgrouprediswebapp1.service.UserRegistrationService;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
	
	private UserRegistrationRepository userRegistrationRepository;
  
    @Autowired
    public UserRegistrationServiceImpl(UserRegistrationRepository userRegistrationRepository) {
        this.userRegistrationRepository =userRegistrationRepository;
        
    }
    
    @Override
    public List<UserRegistration> listAll() {
        List<UserRegistration> userRegistrations = new ArrayList<>();
        userRegistrationRepository.findAll().forEach(userRegistrations::add); //with Java 8
        return userRegistrations;
    }
}
