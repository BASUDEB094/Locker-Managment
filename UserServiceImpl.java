package lock.locker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lock.locker.model.User;
import lock.locker.repo.UserRepo;
import lock.locker.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User getUserById(long id) {
		return userRepo.findById(id).orElseThrow(()-> new lock.locker.exception.ResourceNotFoundException("User", "Id", id));
	}

	@Override
	public User updateUserById(User user, long id) {
		User existuser= userRepo.findById(id).orElseThrow(()-> new lock.locker.exception.ResourceNotFoundException("User", "Id",id));
		existuser.setAge(id);
		existuser.setUser_Name(user.getUser_Name());
		existuser.setLocation(user.getLocation());
		userRepo.save(existuser);
		return existuser;
	}

	@Override
	public void DeleteUser(long id) {
	//	userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "Id",id));
		 userRepo.deleteById( id);
		
	}
	

}
