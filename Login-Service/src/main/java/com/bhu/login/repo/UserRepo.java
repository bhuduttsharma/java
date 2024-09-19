package com.bhu.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhu.login.entity.UserEntity;

import java.util.Optional;

/**
 * @author bhudutt
 */

@Repository
public interface UserRepo  extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByUsername(String username);
}