package com.example.librarybackendspringboot.dao;

import com.example.librarybackendspringboot.model.Userregisteration;
import jakarta.servlet.Registration;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserregisterationDao extends CrudRepository<Userregisteration,Integer> {


    @Query(value = "SELECT `id`, `aadhar`, `address`, `confirmpass`, `dob`, `email`, `name`, `password`, `phoneno`, `pin`, `username` FROM `registeration` WHERE `username`=:username AND `password`=:password",nativeQuery = true)
    List<Userregisteration> userLogin(@Param("username") String username, @Param("password") String password);

    @Query(value = "SELECT `id`, `aadhar`, `address`, `confirmpass`, `dob`, `email`, `name`, `password`, `phoneno`, `pin`, `username` FROM `registeration` WHERE `password` == `confirmpass`",nativeQuery = true)
    List<Userregisteration> userReg(@Param("password") String password, @Param("confirmpass") String confirmpass);
}



