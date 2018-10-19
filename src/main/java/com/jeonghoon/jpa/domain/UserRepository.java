package com.jeonghoon.jpa.domain;

import com.jeonghoon.jpa.core.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Jeonghoon on 2018-10-17.
 */
@Repository
public interface UserRepository extends BaseRepository<User, Long> {
}
