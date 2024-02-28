//import com.example.oAuth.entities.User;
package com.example.oAuth.repository;

import com.example.oAuth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("""
    SELECT distinct u FROM User u WHERE u.name = :name
    """)
    User findUserByName(String name);

}
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public interface UserRepository extends JpaRepository<User,Integer> {
//
//    @Query("select p from user p where p.name= :username")
//    public Optional<User> findUserByName(String username);
//
//
//
//}
