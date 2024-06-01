package SkincareWebApp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "USER")
public class UserEntity {

    @Column(name = "USER_ID")
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "FIRST_NAME")
    @NotNull
    private String firstname;
    @Column(name = "LAST_NAME")
    @NotNull
    private String lastName;
    @Column(name = "EMAIL")
    @NotNull
    private String email;
    @Column(name = "PHONE_NUMBER")
    @NotNull
    private Integer phoneNr;
    @Column(name = "ADDRESS")
    @NotNull
    private String address;
    @Column(name = "FAVOURITES")
    @NotNull
    private String[] favourites;






}
