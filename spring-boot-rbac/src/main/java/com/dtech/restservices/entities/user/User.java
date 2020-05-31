package com.dtech.restservices.entities.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname", length = 45, nullable = false)
    private String firstname;

    @Column(name = "lastname", length = 45, nullable = true)
    private String lastname;

    @Column(name = "email", length = 256, nullable = false, unique = true)
    private String email;

    // No argument constructor (mendatory)
    public User() {
    }

    // Fields constuctor (Optional)
    public User(Long id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    // Getters and Setters (mendatory)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // To String (Optional) (Required for bean logging)
    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", firstname='" + getFirstname() + "'" + ", lastname='" + getLastname()
                + "'" + ", email='" + getEmail() + "'" + "}";
    }

}