package org.lojantakanen.retrofittest;

import java.util.List;

import org.lojantakanen.retrofittest.Model.User;
import org.lojantakanen.retrofittest.event.GitHubUsersEvent;
import org.lojantakanen.retrofittest.service.GitHubService;

import de.greenrobot.event.EventBus;

import retrofit.*;
import android.os.AsyncTask;
import android.content.*;

public class GitHubAsyncTask extends AsyncTaskLoader<List<User>>
{
	private RestAdapter restAdapter;
	private GitHubService service;
	
	public GitHubAsyncTask(Context context) {
		super(context);
		
		restAdapter = new RestAdapter.Builder().
		setEndpoint("https://api.github.com").build();

		service = restAdapter.create(GitHubService.class);		
	}
	
	@Override
	public List<User> loadInBackground()
	{
		return service.listUsers();
	}
}
