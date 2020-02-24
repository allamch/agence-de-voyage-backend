package com.repository;

import com.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<Users, Long> {

    Users findByEmailIgnoreCase(String username);
}
