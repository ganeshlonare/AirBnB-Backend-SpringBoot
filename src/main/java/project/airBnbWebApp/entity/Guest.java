package project.airBnbWebApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import project.airBnbWebApp.entity.enums.Gender;

import java.util.Set;

@Entity
@Data
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer age;

}
