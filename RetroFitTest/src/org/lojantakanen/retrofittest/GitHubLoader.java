package org.lojantakanen.retrofittest;
import android.content.*;
import retrofit.*;
import org.lojantakanen.retrofittest.service.*;

abstract public class GitHubLoader<D> extends AsyncTaskLoader<D>
{
	protected RestAdapter restAdapter;
	protected GitHubService service;

	public GitHubLoader(Context context) {
		super(context);

		restAdapter = new RestAdapter.Builder().
			setEndpoint("https://api.github.com").build();

		service = restAdapter.create(GitHubService.class);		
	}
	
	public abstract D loadInBackground();
}
