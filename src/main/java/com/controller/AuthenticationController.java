package com.controller;

import com.Security.JwtTokenUtil;
import com.Security.JwtUser;
import com.Security.UnauthorizedException;
import com.domain.LoginResponse;
import com.entities.Users;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AuthenticationController {
    @Value("${jwt.header}")
    private String tokenHeader;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired private UserRepository userDao;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<LoginResponse> login(@RequestBody Users user){
//        Authentication authentication= authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(),user.getPassword()));
//        final JwtUser userDetails= (JwtUser)authentication.getPrincipal();
//        SecurityContextHolder.getContext().setAutherntication(authentication);
            Users u = userDao.findByEmailIgnoreCase(user.getEmail());
        String token = "";
            if(u.getPassword().equals("adminadmin")) {
//                final String token=jwtTokenUtil.generateToken((JwtUser) u);
               token = "AHWqTUmyrus6-mWnRkn6T_uXyD_8vGpf5-TUNBC8b2Ch39TO5McvNHdR_XH_Nb0y";
            }
//        return  new ResponseEntity<>(new LoginResponse(token,userDetails.getUser()),HttpStatus.OK);
        return  new ResponseEntity<>(new LoginResponse(token,u),HttpStatus.OK);
    }

}
