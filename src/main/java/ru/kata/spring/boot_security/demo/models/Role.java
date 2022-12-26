package ru.kata.spring.boot_security.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="roles")

public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "role")
    private String role;



    public Role(){}

    public Role(String role) {
        this.role =role;
    }

    public Role(int id, String role) {
        this.id = id;
        this.role =role;
    }
    public Role(int id) {
        this.id = id;
    }

    public long getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getRole() {return role;}
    public void setRole(String role) {this.role = role;}


    public String toString() {
        return role;
    }

    @Override
    public String getAuthority() {
        return this.role;
    }





}
