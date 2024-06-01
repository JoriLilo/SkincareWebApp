package SkincareWebApp.repository;

import SkincareWebApp.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query("select P from Product P where P.name= :name")
    Optional <ProductEntity> getByName(@Param("name") String name);

//    @Query("select P from Product P where P.category= :category")
//    Optional <ProductEntity> getByCategory(@Param("category") ProductCategory category);

//    @Query("select P from Product P")
    List<ProductEntity> findAll();

    Optional<ProductEntity> findByName(String name);







}
