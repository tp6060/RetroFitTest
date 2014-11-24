package org.lojantakanen.retrofittest.service;

import java.util.List;

import org.lojantakanen.retrofittest.Model.User;

import retrofit.http.GET;

public interface GitHubService {
	@GET("/users") 
	List<User> listUsers();
	
}
