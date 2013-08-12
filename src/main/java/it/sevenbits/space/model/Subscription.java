package it.sevenbits.space.model;

/**
 * Created with IntelliJ IDEA.
 * User: denis
 * Date: 7/23/13
 * Time: 2:58 PM
 */

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "subscription")
public class Subscription implements Serializable {

    private Long id;
    private String email;

    public Subscription() {
    }

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
