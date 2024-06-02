package SkincareWebApp.service;

import SkincareWebApp.entities.UserEntity;
import SkincareWebApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {



        @Autowired
        private UserRepository userRepository;

        // find
        public List<UserEntity> findAllUsers() {
            return userRepository.findAll();
        }

        public UserEntity getUserById(Long id) {
            return userRepository.getById(id);
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
            userRepository.editFavouriteList(id, favouriteList);
        }
    }

