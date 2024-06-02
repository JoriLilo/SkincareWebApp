package SkincareWebApp.service;

import SkincareWebApp.entities.Admin;
import SkincareWebApp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AdminService {

    @Autowired
    private final AdminRepository repository;

    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }


    public Optional<Admin> findById(Long id){
        return repository.findById(id);
    }

    public Admin save(Admin entity) {
        return repository.save(entity);
    }

    public Admin updateAdmin(Admin model) throws Exception {
        Optional<Admin> admin = findById(model.getId());

        admin.ifPresent(s -> {
            s.setFirstName(model.getFirstName());
            s.setLastName(model.getLastName());
            s.setEmail(model.getEmail());
            s.setPassword(model.getPassword());

        });

       Admin updated = admin.orElseThrow(() -> new Exception("Cannot find admin!"));
        return repository.save(updated);
    }

    public void delete(Long id) throws Exception {
        repository.delete(findById(id).orElseThrow(() -> new Exception("Cannot find admin!")));
    }











}
