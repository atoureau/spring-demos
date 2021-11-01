package com.spring.demo.accesingdatamysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.demo.accesingdatamysql.entity.User;

/**
 * Inherits basic CRUD operations to implement for this entity: User.
 * @author Alexander Toureau
*/
public interface UserRepository extends CrudRepository<User, Long> {
}
