package com.spring.demo.accesingdatamysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.demo.accesingdatamysql.entity.User;

/**
 * Inherits CRUD operations implemented by Spring for the User entity.
 * @author Alexander Toureau
*/
public interface UserRepository extends CrudRepository<User, Long> {
}
