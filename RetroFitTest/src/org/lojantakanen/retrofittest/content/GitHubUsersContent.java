package org.lojantakanen.retrofittest.content;

import java.util.List;

import org.lojantakanen.retrofittest.GitHubAsyncTask;
import org.lojantakanen.retrofittest.Model.User;
import org.lojantakanen.retrofittest.event.GitHubUsersEvent;

import android.util.Log;

import de.greenrobot.event.EventBus;

public class GitHubUsersContent {
	private final static String TAG="GitHubUsersContent";
	public List<User> users;
	private GitHubAsyncTask task = new GitHubAsyncTask();
	
	public GitHubUsersContent() {
		EventBus.getDefault().register(this);
		task = new GitHubAsyncTask();
		task.execute();
	}
	
	public void onEvent(GitHubUsersEvent event) {
		Log.i(TAG, "onEvent");
		users = event.getUsers();
		
	}
	List<User> getUsers() {
		return users;
	}
	
}
