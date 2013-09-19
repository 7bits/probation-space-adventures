package it.sevenbits.space.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "comment")
public class Comment implements Serializable {

    private Long id;
    private String body;
    private Long date;
    private String email;
    private Long userId;
    private Long eventId;
    private Long vkId;
    private String img;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    @Column(name = "body", nullable = false, columnDefinition = "TEXT")
    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
    }

    @Column(name = "date", nullable = false)
    public Long getDate() {
        return date;
    }

    public void setDate(final Long date) {
        this.date = date;
    }

    @Column(name = "email", length = 30, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Id
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "event_id")
    public Long getEventId() {
        return eventId;
    }

    public void setEventId(final Long eventId) {
        this.eventId = eventId;
    }

    @Id
    @Column(name = "vk_id")
    public Long getVkId() {
        return vkId;
    }

    public void setVkId(final Long vkId) {
        this.vkId = vkId;
    }

    @Column(name = "name")
    public String getImg() {
        return img;
    }

    public void setImg(final String img) {
        this.img = img;
    }
}


