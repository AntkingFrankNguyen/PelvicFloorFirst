package com.cfa.pelvicfloorfirst.activity;

import android.os.Bundle;
import android.util.Log;

import com.cfa.pelvicfloorfirst.R;
import com.cfa.pelvicfloorfirst.ui.SimpleBottomBarView;
import com.cfa.pelvicfloorfirst.ui.TitleBarView;

public class BaseSimpleActivity extends BaseActivity {
	private static final String TAG = "BaseSimpleActivity";
	protected SimpleBottomBarView simpleBottomBarView;
	protected TitleBarView titleBarView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		simpleBottomBarView = (SimpleBottomBarView) findViewById(R.id.simpleBottomBarView1);
		titleBarView = (TitleBarView) findViewById(R.id.titleBarView1);
	}

	@Override
	public void setTitle(CharSequence title) {
		// super.setTitle(title);
		if (titleBarView != null) {
			titleBarView.setTitle(title);
		} else {
			Log.e(TAG, "Can not file title Bar");
		}
	}
}
