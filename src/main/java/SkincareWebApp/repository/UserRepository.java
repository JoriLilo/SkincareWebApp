package SkincareWebApp.repository;

import SkincareWebApp.entities.Admin;
import SkincareWebApp.entities.ProductEntity;
import SkincareWebApp.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {



        // find
        List<UserEntity> findAll();

        UserEntity getById(Long id);

        // add
        UserEntity save(UserEntity userEntity);




        // editFavouriteList

        @Modifying
        @Query("UPDATE UserEntity u SET u.favourite =?2 WHERE u.id =?1")
        void editFavouriteList(Long id, List<String> favouriteList);
    }


}
