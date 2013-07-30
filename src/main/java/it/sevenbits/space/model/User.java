package it.sevenbits.space.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {

    private Long id;
    private String name;
    private String email;
    private boolean eye;
    private String role;

    public User(Long id, String name, String email, boolean eye, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.eye = eye;
        this.role = role;
    }

    public User(){}

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", length = 50, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "email", length = 30, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "eye", columnDefinition = "TINYINT(1)")
    public boolean isEye() {
        return eye;
    }

    public void setEye(boolean eye) {
        this.eye = eye;
    }

    @Column(name = "role", length = 20, nullable = false)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
