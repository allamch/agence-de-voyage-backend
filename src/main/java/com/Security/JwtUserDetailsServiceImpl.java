package com.Security;

import com.repository.UserRepository;
import com.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user =  userRepository.findByEmailIgnoreCase(username);
        if(user==null){
            throw new UsernameNotFoundException(String.format("NO USER FOUND WITH THIS USERNAME'%$'", username));
        }
        else {
return  JwtUserFactory.create(user);
        }
    }
}
