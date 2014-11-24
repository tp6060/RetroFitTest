package org.lojantakanen.retrofittest.content;

import java.util.List;

import org.lojantakanen.retrofittest.GitHubUsersLoader;
import org.lojantakanen.retrofittest.Model.User;
import org.lojantakanen.retrofittest.event.GitHubUsersEvent;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.Loader;
import android.os.Bundle;
import android.util.Log;

import de.greenrobot.event.EventBus;

public class GitHubUsersContent implements LoaderCallbacks {
	private final static String TAG="GitHubUsersContent";
	public List<User> users;
	private static int LOADER_ID = 0x01;
	Context context;
	
	public GitHubUsersContent(Context context) {
		this.context = context;
	}
	
	@Override
	public Loader onCreateLoader(int id, Bundle args) {
		GitHubUsersLoader loader = new GitHubUsersLoader(context); 
		return loader;
	}

	@Override
	public void onLoadFinished(Loader arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLoaderReset(Loader arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
