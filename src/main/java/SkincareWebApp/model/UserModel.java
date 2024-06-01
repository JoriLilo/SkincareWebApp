package SkincareWebApp.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @NotNull
    private Long id;
    @NotNull
    private String firstname;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private Integer phoneNr;
    @NotNull
    private String address;

    private String[] favourites;
}
