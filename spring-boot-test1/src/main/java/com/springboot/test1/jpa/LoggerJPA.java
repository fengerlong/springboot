package com.springboot.test1.jpa;

import com.springboot.test1.entity.LoggerEntity;
import com.springboot.test1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface LoggerJPA extends JpaRepository<LoggerEntity,Long> ,JpaSpecificationExecutor<LoggerEntity>,Serializable {

}
