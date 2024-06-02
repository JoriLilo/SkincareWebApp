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
        public void editFavouriteList(Long id, List<String> favouriteList) {
            //find by id
           //Optional<Orders> orders = findById
            //set new info
            //re-save with new info
            userRepository.editFavouriteList(id, favouriteList);


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
        }
    }

