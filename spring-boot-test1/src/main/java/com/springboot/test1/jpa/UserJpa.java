package com.springboot.test1.jpa;

import com.springboot.test1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

public interface UserJpa extends JpaRepository<User,Integer> ,JpaSpecificationExecutor<User>,Serializable {

}
