package com.biryanivibes.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.biryanivibes.model.User;

public interface UserRepository extends CrudRepository<User, Serializable> {

	List<User>findAll();

}
