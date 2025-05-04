package project.airBnbWebApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import project.airBnbWebApp.entity.enums.Role;

import java.util.Set;

@Data
@Entity
@Table(
        name = "app_user"
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true , nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Role> role;
}
