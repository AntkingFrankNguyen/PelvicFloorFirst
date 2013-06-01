package com.cfa.pelvicfloorfirst.activity;

import com.cfa.pelvicfloorfirst.R;
import com.cfa.pelvicfloorfirst.ui.MainBottomBarView;
import com.cfa.pelvicfloorfirst.ui.NavigationBarView;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {
	protected BaseActivity mContext;
	protected NavigationBarView topbar;
	protected MainBottomBarView bottombar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mContext = this;
		topbar = (NavigationBarView)findViewById(R.id.navigationBarView1);
		bottombar = (MainBottomBarView)findViewById(R.id.mainBottomBarView1);
	}
}
