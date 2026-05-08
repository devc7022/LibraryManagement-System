package com.perfectkode.lms.User.repository;

import com.perfectkode.lms.User.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

}
