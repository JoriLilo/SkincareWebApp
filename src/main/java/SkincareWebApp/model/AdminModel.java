package SkincareWebApp.model;

//import SkincareWebApp.enums.ProductList;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminModel {

    private Long Id;

    @NotNull
    @Size(min = 3, max = 32)
    private String firstName;
    @NotNull
    @Size(min = 3, max = 32)
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String password;
//    @NotNull
//    private ProductList productList;


}
