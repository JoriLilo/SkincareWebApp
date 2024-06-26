package SkincareWebApp.repository;

import SkincareWebApp.entities.Admin;
import SkincareWebApp.entities.ProductCategory;
import SkincareWebApp.entities.ProductEntity;
import SkincareWebApp.entities.SkinType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findAll();


    Optional<ProductEntity> findAllByName(String name);

    @Query("select P from ProductEntity P where P.category = :category")
    Optional<ProductEntity> findAllByCategory(@Param("category") ProductCategory category);

    @Query("select P from ProductEntity P where P.skinType = :skinType")
    Optional<ProductEntity> findAllBySkinType(@Param("skinType") SkinType skinType);


    List<ProductEntity> findByAdmin(Admin admin);
}
