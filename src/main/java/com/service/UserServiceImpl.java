package com.service;

import com.repository.UserRepository;
import com.entities.Users;
import com.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Users save(Users user) {
        String password= PasswordUtil.getPasswordHash(user.getPassword());
        user.setPassword(password);
        user.setCreatedDate(new Date());
        return userRepository.save(user);
    }

    @Override
    public List<Users> findAll() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserByEmail(String email) {
        return userRepository.findByEmailIgnoreCase(email);
    }
}
