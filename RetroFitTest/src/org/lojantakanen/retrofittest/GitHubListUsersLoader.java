package org.lojantakanen.retrofittest;

import java.util.List;

import org.lojantakanen.retrofittest.Model.User;
import org.lojantakanen.retrofittest.event.GitHubUsersEvent;
import org.lojantakanen.retrofittest.service.GitHubService;

import retrofit.*;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.os.AsyncTask;

public class GitHubListUsersLoader extends GitHubLoader<List<User>> {
	private List<User> users;

	public GitHubListUsersLoader(Context context) {
		super(context);
	}
	
	@Override
	public List<User> loadInBackground() {
		// Call the service GitHubService.listUsers
		users = service.listUsers();
		return users;
	}
}
