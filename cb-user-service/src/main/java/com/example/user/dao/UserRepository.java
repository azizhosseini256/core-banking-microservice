package com.example.user.dao;

import com.example.user.domain.UserDomain;
import com.example.user.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserDomain, Long> {

    UserDomain findUserDomainByUsername(String username);

    @Modifying
    void deleteUserDomainByUsername(String username);

    @Modifying
    @Query(value = """
        UPDATE user_tb u SET
        u.username = :#{#model.username},
        u.password = :#{#model.password},
        u.fk_prs   = :#{#model.personId}
        where u.username = :username
        """, nativeQuery = true)
    void updateUserDomainByUsername(UserModel model, String username);

}