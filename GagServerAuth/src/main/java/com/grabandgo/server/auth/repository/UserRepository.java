package com.grabandgo.server.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grabandgo.server.auth.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
