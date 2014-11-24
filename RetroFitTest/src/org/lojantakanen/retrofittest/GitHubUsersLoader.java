package org.lojantakanen.retrofittest;

import java.util.List;

import org.lojantakanen.retrofittest.Model.User;
import org.lojantakanen.retrofittest.event.GitHubUsersEvent;
import org.lojantakanen.retrofittest.service.GitHubService;

import de.greenrobot.event.EventBus;

import retrofit.*;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.os.AsyncTask;

public class GitHubUsersLoader extends AsyncTaskLoader<List<User>> {
	private RestAdapter restAdapter;
	private GitHubService service;
	public GitHubUsersLoader(Context context) {
		super(context);
		restAdapter = new RestAdapter.Builder().setEndpoint(
				"https://github.com").build();
		service = restAdapter.create(GitHubService.class);
	}

	private List<User> users;
	@Override
	public List<User> loadInBackground() {
		// Call the service GitHubService.listUsers
		users = service.listUsers();
		return null;
	}
}
