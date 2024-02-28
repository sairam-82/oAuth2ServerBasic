package com.example.oAuth.service;

import com.example.oAuth.entities.User;
import com.example.oAuth.repository.UserRepository;
import com.example.oAuth.security.SecurityUser;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService  {


    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findUserByName(username);

        System.out.println(username);
//        System.out.println(user.getName());
//        User u=user.;
//        if (user==null)
//        System.out.println("hii");
        SecurityUser sc=Optional.of(user).map(SecurityUser::new).orElseThrow(() -> new UsernameNotFoundException("Username not found " + username));
//        System.out.println(sc.getPassword());
        return sc;
    }

//    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
//
//
//
//
//
//
//    }

}
