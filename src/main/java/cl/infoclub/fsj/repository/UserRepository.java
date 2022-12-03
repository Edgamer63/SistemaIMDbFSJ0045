package cl.infoclub.fsj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.infoclub.fsj.modelo.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findAll();

	User findByUsername(String username);

	User findUserByEmail(String email);
}