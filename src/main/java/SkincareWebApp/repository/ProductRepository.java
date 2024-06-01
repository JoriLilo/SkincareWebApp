package SkincareWebApp.repository;

import SkincareWebApp.entities.ProductCategory;
import SkincareWebApp.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findAll();

    @Query("select P from ProductEntity P where P.name = :name")
    Optional<ProductEntity> findAllByName(@Param("name") String name);









}
