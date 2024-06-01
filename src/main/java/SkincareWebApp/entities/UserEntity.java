package SkincareWebApp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "USER")
public class UserEntity {

    @Column(name = "USER_ID")
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(name = "FIRST_NAME")
    @NotNull
    private String firstName;

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

    @OneToMany
    private List<Orders> orderId;







}
