package org.lojantakanen.retrofittest;
import android.app.*;
import android.os.*;
import android.content.*;
import android.view.*;
import android.util.*;
import org.lojantakanen.retrofittest.Model.*;
import android.text.*;
import android.widget.*;

public class TestMainActivity extends Activity
implements LoaderManager.LoaderCallbacks<User>
{
	private static final String TAG="TestMainActivity";
	public static final int LOADER_ID = 0x01;
	
	@Override
	public Loader<User> onCreateLoader(int id, Bundle args)
	{
		Toast.makeText(this, "onCreateLoader", Toast.LENGTH_SHORT).show();
		return new GitHubGetUserLoader(this);
	}

	@Override
	public void onLoadFinished(Loader<User> loader, User user)
	{
		TextView login = 
		(TextView)findViewById(R.id.testmainactivityTextView1);
		login.setText(user.getLogin());
		
		TextView id = 
		(TextView)findViewById(R.id.testmainactivityTextView2);
		id.setText("fdghdufhg");
		
		Log.i(TAG, "onLoadFinished");
	}

	@Override
	public void onLoaderReset(Loader p1)
	{
		// TODO: Implement this method
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		Loader<User> loader;
		Toast.makeText(this, "onCreateLoader", Toast.LENGTH_SHORT).show();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testmain_activity);
		loader = getLoaderManager().initLoader(LOADER_ID, 
		savedInstanceState, this);
		loader.forceLoad();
	}	
}
