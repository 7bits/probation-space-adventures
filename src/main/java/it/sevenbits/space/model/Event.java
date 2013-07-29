package it.sevenbits.space.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "event")
public class Event implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Long date;
    private boolean eye;
    private Long CreatorId;
    private String video;

    //конструктор Event id создателя события и ссылка на видео закоменченны
    public Event(String name,
                 String description,
                 Long date,
                 boolean eye
                 /*, Long CreatorId, String video*/) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.eye = eye;
        /*this.CreatorId = CreatorId;
        this.video = video; */
    }

    public Event() {
    }

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

    @Column(name = "description", nullable = false, columnDefinition="TEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "date", nullable = false)
    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    @Column(name = "eye", columnDefinition = "TINYINT(1)")
    public boolean isEye() {
        return eye;
    }

    public void setEye(boolean eye) {
        this.eye = eye;
    }

    /*
    @Column(name = "CreatorId")
    public Long getidCreator() {
        return CreatorId;
    }

    public void setidCreator(Long id_creator) {
        this.CreatorId = CreatorId;
    }

    @Column(name = "video")
    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    */
}
