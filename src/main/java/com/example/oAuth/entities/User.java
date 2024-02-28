package com.example.oAuth.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.mapping.Join;

import java.util.List;

@Entity
@Getter
@Setter

@Table(name="users")
public class User {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;


    private String name;
    private String password;



    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
            @JoinTable(name =("user_authorities"),
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id"))
    @Fetch(FetchMode.JOIN)
    private List<Authority> authorities;

}
