package softuni.exam.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Team extends BaseEntity{

    private String name;
    private Picture picture;

    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Team() {
    }
}
