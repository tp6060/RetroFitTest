package org.lojantakanen.retrofittest.service;

import java.util.List;

import org.lojantakanen.retrofittest.Model.User;

import retrofit.http.GET;
import retrofit.http.*;

public interface GitHubService {
	@GET("/users") 
	List<User> listUsers();

	@GET("/users/{username}")
	User getUser(@Path("username") String username);

}
