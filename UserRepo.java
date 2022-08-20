package lock.locker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lock.locker.model.User;

@Repository
public interface UserRepo  extends JpaRepository<User, Long>{

}
