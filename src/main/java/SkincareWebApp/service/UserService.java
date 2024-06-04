package SkincareWebApp.service;

import SkincareWebApp.entities.Admin;
import SkincareWebApp.entities.Orders;
import SkincareWebApp.entities.UserEntity;
import SkincareWebApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    // find
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // add
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    // save
    public Iterable<UserEntity> saveAllUsers(Iterable<UserEntity> userEntities) {
        return userRepository.saveAll(userEntities);
    }

    // editFavouriteList
    // editFavouriteList
    public void editFavouriteList(Long id, String[] favouriteList) {
        // Find the user entity by ID
        Optional<UserEntity> optionalUser = userRepository.findById(id);

        // Check if the user exists
        if (optionalUser.isPresent()) {
            // Get the user entity
            UserEntity userEntity = optionalUser.get();

            // Set the new favorite list
            userEntity.setFavourites(favouriteList);

            // Save the updated user entity
            userRepository.save(userEntity);
        } else {
            // Handle the case when the user does not exist
            // You may throw an exception, log an error, or handle it in any other appropriate way
            // For example:
            throw new RuntimeException("User with ID " + id + " not found");
        }
    }
}

    //            public Admin updateAdmin(Admin model) throws Exception {
//                Optional<Admin> admin = findAdminById(model.getId());
//
//                admin.ifPresent(s -> {
//                    s.setFirstName(model.getFirstName());
//                    s.setLastName(model.getLastName());
//                    s.setEmail(model.getEmail());
//                    s.setPassword(model.getPassword());
//
//                });


