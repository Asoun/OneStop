package io.swagger.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.swagger.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, String>{
	/*
	 * 
	 * @Query("select password from User where userName=?1") public Optional<String>
	 * findByuserName(String userName);
	 * 
	 * 
	 * @Query("select userName from User where userName=?1") Optional<String>
	 * checkUserName(String userName);
	 */	 
}
