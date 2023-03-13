package com.test.security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.test.security.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
