package com.Security;

import com.entities.Users;
import org.springframework.security.authentication.jaas.AuthorityGranter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JwtUserFactory {

    public static JwtUser create(Users user){
        return   new JwtUser( user.getId(),user.getEmail(),user.getPassword(),user,maptoGrantedAuthorities(new ArrayList<String>(Arrays.asList("ROLE "+user.getRole().getRoleName()))),user.isEnabled());


    }

    private static List <GrantedAuthority> maptoGrantedAuthorities(List<String> authoroties) {
        return  authoroties.stream().map(Authority-> new SimpleGrantedAuthority(Authority)).collect(Collectors.toList());

    }

}
