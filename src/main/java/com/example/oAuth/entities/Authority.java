package com.example.oAuth.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter

@Entity

@Table(name="authorities")
public class Authority {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authority_id")
    private Integer id;

    @Column(name="authority")
    private  String authority;



    @ManyToMany(mappedBy = "authorities")
    private List<User> users;

    @Override
    public String toString() {
        return "Authority{ " +authority+" }";
    }
}
