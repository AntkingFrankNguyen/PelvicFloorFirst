package com.cfa.pelvicfloorfirst.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.cfa.pelvicfloorfirst.R;
import com.cfa.pelvicfloorfirst.util.CommConstant;
import com.cfa.pelvicfloorfirst.util.Util;

public class LogoAnimationActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logo_animation);

		MainCountDown countDown = new MainCountDown(1000, 100);
		countDown.start();

//		SharedPreferences account = getSharedPreferences(CommConstant.PREFS_NAME, 0);

		// We need an Editor object to make preference changes.
//		SharedPreferences.Editor editor = account.edit();
//
//		editor.putString(CommConstant.WEATHER_INFO, "");
//		editor.putString(CommConstant.REQUEST_GPS, "");
//		editor.putString(CommConstant.ADDRESS, "");
//		
//		// Commit the edits!
//		editor.commit();
	}

	protected class MainCountDown extends CountDownTimer {

		public MainCountDown(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
			//
		}

		@Override
		public void onFinish() {
			startMain();
		}

		@Override
		public void onTick(long millisUntilFinished) {
			//
		}

	}

	private void startMain() {
		Util.callActivity(this, CommConstant.ACTIVITY_INTRODUCTION);
		finish();
		overridePendingTransition(R.anim.appear, R.anim.dissmis);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.gc();
	}
}

