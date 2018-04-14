package uvsoftgroup.uvsoftgrouprediswebapp1.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uvsoftgroup.uvsoftgrouprediswebapp1.model.UserRole;
import uvsoftgroup.uvsoftgrouprediswebapp1.repository.UserRoleRepository;
import uvsoftgroup.uvsoftgrouprediswebapp1.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService{
	private UserRoleRepository userRoleRepository;
	  
    @Autowired
    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository =userRoleRepository;
        
    }
    
    @Override
    public List<UserRole> listAll() {
        List<UserRole> userRoles = new ArrayList<>();
        userRoleRepository.findAll().forEach(userRoles::add); //with Java 8
        return userRoles;
    }
}
