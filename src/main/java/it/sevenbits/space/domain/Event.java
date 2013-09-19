package it.sevenbits.space.domain;

import org.joda.time.DateTime;

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

    @Column(name = "name", length = 50, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @Column(name = "date", nullable = false)
    public Long getDate() {
        return date;
    }

    public void setDate(final Long date) {
        this.date = date;
    }

    @Column(name = "eye", columnDefinition = "TINYINT(1)")
    public boolean getEye() {
        return eye;
    }

    public void setEye(final boolean eye) {
        this.eye = eye;
    }

    @Column(name = "img", length = 100, nullable = false)
    public String getImg() {
        return img;
    }

    public void setImg(final String img) {
        this.img = img;
    }

    @Transient
    public String getHumanReadableDate() {
        if (date == null) {
            return "";
        } else {
            DateTime dateTime = new DateTime(date);
            String buff = dateTime.toString("dd MMMM yyyy");
            return buff;
        }
    }

    //поля для создателя события и ссылки на видео
    /*
    @Column(name = "CreatorId")
    public Long getIdCreator() {
        return CreatorId;
    }

    public void setIdCreator(Long id_creator) {
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
