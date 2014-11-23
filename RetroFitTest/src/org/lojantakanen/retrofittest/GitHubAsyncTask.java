package org.lojantakanen.retrofittest;

import java.util.List;

import org.lojantakanen.retrofittest.Model.User;
import org.lojantakanen.retrofittest.event.GitHubUsersEvent;
import org.lojantakanen.retrofittest.service.GitHubService;

import de.greenrobot.event.EventBus;

import retrofit.*;
import android.os.AsyncTask;

public class GitHubAsyncTask extends AsyncTask<Void, Integer, List<User>> {

	private List<User> users;
	@Override
	protected List<User> doInBackground(Void... arg0) {
		RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("https://api.github.com").build();
		GitHubService service = restAdapter.create(GitHubService.class);
		users = service.listUsers();
		return users;
	}
 
	@Override
	protected void onPostExecute(List<User> result) {
		EventBus.getDefault().post(new GitHubUsersEvent(users));
		super.onPostExecute(result);
	}
}
