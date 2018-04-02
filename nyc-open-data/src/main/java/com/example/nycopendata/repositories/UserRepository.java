package com.example.nycopendata.repositories;

import com.example.nycopendata.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}