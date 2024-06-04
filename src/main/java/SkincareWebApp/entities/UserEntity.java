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

    public UserEntity(Long userId, String firstName,
                      String lastName, String email,
                      Integer phoneNr, String address,
                      @NotNull String[] favourites,
                      List<Orders> orderId) {


        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNr = phoneNr;
        this.address = address;
        this.favourites = favourites;
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(Integer phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getFavourites() {
        return favourites;
    }

    public void setFavourites(String[] favourites) {
        this.favourites = favourites;
    }

    public List<Orders> getOrderId() {
        return orderId;
    }

    public void setOrderId(List<Orders> orderId) {
        this.orderId = orderId;
    }
}
