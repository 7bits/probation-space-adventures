package it.sevenbits.space.domain;

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

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    @Column(name = "name", length = 50, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Column(name = "email", length = 30, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Column(name = "eye", columnDefinition = "TINYINT(1)")
    public boolean isEye() {
        return eye;
    }

    public void setEye(final boolean eye) {
        this.eye = eye;
    }

    @Column(name = "role", length = 20, nullable = false)
    public String getRole() {
        return role;
    }

    public void setRole(final String role) {
        this.role = role;
    }
}
