package com.cfa.pelvicfloorfirst.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.cfa.pelvicfloorfirst.R;
import com.cfa.pelvicfloorfirst.util.CommConstant;
import com.cfa.pelvicfloorfirst.util.Util;

public class HomeActivity extends BaseActivity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_home);
		super.onCreate(savedInstanceState);

		Button btnLogin = (Button) findViewById(R.id.btn_login);
		btnLogin.setOnClickListener(this);
		Button btnStart = (Button) findViewById(R.id.btn_start);
		btnStart.setOnClickListener(this);
		Button btnSaved = (Button) findViewById(R.id.btn_saved);
		btnSaved.setOnClickListener(this);
		Button btnShare = (Button) findViewById(R.id.btn_share);
		btnShare.setOnClickListener(this);
		Button btnAbout = (Button) findViewById(R.id.btn_about);
		btnAbout.setOnClickListener(this);
		Button btnLink = (Button) findViewById(R.id.btn_link);
		btnLink.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_login:
			Util.callActivity(mContext, CommConstant.ACTIVITY_LOGIN);
			break;
		case R.id.btn_start:
			Util.callActivity(mContext, CommConstant.ACTIVITY_START_TYPE);
			break;
		case R.id.btn_saved:
			Util.callActivity(mContext, CommConstant.ACTIVITY_SAVE);
			break;
		case R.id.btn_share:
			Util.callActivity(mContext, CommConstant.ACTIVITY_SHARE);
			break;
		case R.id.btn_about:
			Util.callActivity(mContext, CommConstant.ACTIVITY_ABOUT_US);
			break;
		case R.id.btn_link:
			Util.callActivity(mContext, CommConstant.ACTIVITY_LINK);
			break;

		default:
			break;
		}
	}
}
