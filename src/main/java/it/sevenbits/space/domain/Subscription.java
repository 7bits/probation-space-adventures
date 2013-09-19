package it.sevenbits.space.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "subscription")
public class Subscription implements Serializable {

    private Long id;
    private String email;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    @NotNull
    @Column(name = "email", length = 128, nullable = false, unique = true)
    public String getEmail() {
        return email;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
}
