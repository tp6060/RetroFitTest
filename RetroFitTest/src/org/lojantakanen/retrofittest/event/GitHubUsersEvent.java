package org.lojantakanen.retrofittest.event;

import java.util.List;

import org.lojantakanen.retrofittest.Model.User;

public class GitHubUsersEvent {
	List<User> users;

	public GitHubUsersEvent(List<User> users) {
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
