package com.codewithrj.fullstackbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithrj.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
