package it.sevenbits.space.model;

/**
 * Created with IntelliJ IDEA.
 * User: denis
 * Date: 7/23/13
 * Time: 2:58 PM
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "subscription")
public class Subscription implements Serializable {

    private Long id;
    private String email;

    public Subscription(String email) {
        this.email = email;
    }

    public Subscription() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    @Column(name = "email", length = 128, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
