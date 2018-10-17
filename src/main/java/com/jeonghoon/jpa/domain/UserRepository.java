package com.jeonghoon.jpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Jeonghoon on 2018-10-17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
