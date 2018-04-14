package uvsoftgroup.uvsoftgrouprediswebapp1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import uvsoftgroup.uvsoftgrouprediswebapp1.model.UserRegistration;

@Service
public interface UserRegistrationService {

	public List<UserRegistration> listAll();
}
