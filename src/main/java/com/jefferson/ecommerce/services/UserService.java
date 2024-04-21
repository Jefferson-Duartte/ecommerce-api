package com.jefferson.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.jefferson.ecommerce.entities.User;
import com.jefferson.ecommerce.repositories.UserRepository;
import com.jefferson.ecommerce.services.exceptions.DatabaseException;
import com.jefferson.ecommerce.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	public List<User> findAll()	{
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User user){
		return repository.save(user);
	}

	public void delete(Long id) {
		try {
	        if (repository.existsById(id)) {
	            repository.deleteById(id);			
	        } else {				
	            throw new ResourceNotFoundException(id);			
	        }		
	    } catch (DataIntegrityViolationException e) {			
	        throw new DatabaseException(e.getMessage());		
	    }	
	}
	
	public User update(Long id, User user) {
		User entity = repository.getReferenceById(id);
		updateData(entity, user);
		return repository.save(entity);
	}

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
 	
	}

}
