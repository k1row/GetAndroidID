package jp.k16.getandroidid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String android_id = android.provider.Settings.Secure.getString(
				getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);
				Log.v("tag", "ANDROID_ID=" + android_id);
				
				TextView tv = (TextView)findViewById(R.id.android_id);
				tv.setText("Your Android ID is：" + android_id);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
