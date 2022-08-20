package lock.locker.service;

import java.util.List;

import lock.locker.model.User;
public interface UserService {
	
	User saveUser(User user);
	List<User> getAllUsers();
	User getUserById(long id);
	User updateUserById(User user,long id);
	void DeleteUser(long id);

}
