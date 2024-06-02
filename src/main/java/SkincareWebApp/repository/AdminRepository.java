package SkincareWebApp.repository;

import SkincareWebApp.entities.Admin;
import SkincareWebApp.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository  extends JpaRepository<Admin, Long> {

    Optional<Admin> findById(Long id);



}
