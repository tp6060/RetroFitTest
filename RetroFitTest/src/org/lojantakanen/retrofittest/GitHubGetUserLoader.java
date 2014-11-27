package org.lojantakanen.retrofittest;
import android.content.*;
import org.lojantakanen.retrofittest.Model.*;

public class GitHubGetUserLoader extends GitHubLoader<User>
{
	public GitHubGetUserLoader(Context context)
	{
		super(context);
	}
	
	@Override
	public User loadInBackground()
	{
		User user = service.getUser("tp6060");
		return user;
	}

}
