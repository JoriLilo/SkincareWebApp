package SkincareWebApp.service;

import SkincareWebApp.entities.Admin;
import SkincareWebApp.entities.ProductEntity;
import SkincareWebApp.repository.AdminRepository;
import SkincareWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private ProductRepository productRepository;


    public List<Admin> findAllAdmins() {
        return adminRepository.findAll();
    }

    public Optional<Admin> findAdminById(Long id) {
        return adminRepository.findById(id);
    }



    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    public List<ProductEntity> findProductsByAdmin(Admin admin) {
        return productRepository.findByAdmin(admin);
    }

    public ProductEntity saveProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }




    public Admin updateAdmin(Admin model) throws Exception {
        Optional<Admin> admin = findAdminById(model.getId());

        admin.ifPresent(s -> {
            s.setFirstName(model.getFirstName());
            s.setLastName(model.getLastName());
            s.setEmail(model.getEmail());
            s.setPassword(model.getPassword());

        });

       Admin updated = admin.orElseThrow(() -> new Exception("Cannot find admin!"));
        return adminRepository.save(updated);
    }

    public void delete(Long id) throws Exception {
        adminRepository.delete(findAdminById(id).orElseThrow(() -> new Exception("Cannot find admin!")));
    }











}
