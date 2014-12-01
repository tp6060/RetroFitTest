package org.lojantakanen.retrofittest.Model;

public class User {
	private String login;
	private int id;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String toString() {
		return login;
	} 

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
