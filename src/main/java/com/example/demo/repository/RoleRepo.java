package com.example.demo.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Role;

public interface RoleRepo extends CrudRepository<Role, String> {

}
