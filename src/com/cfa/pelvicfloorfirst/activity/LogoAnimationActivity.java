package com.cfa.pelvicfloorfirst.activity;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.DisplayMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.cfa.pelvicfloorfirst.R;
import com.cfa.pelvicfloorfirst.util.CommConstant;
import com.cfa.pelvicfloorfirst.util.Util;

public class LogoAnimationActivity extends Activity {
	
	ImageView ivLogo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logo_animation);
		
		ivLogo = (ImageView) findViewById(R.id.ivLogo);

	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		animationLogo();
	}
	
	private void animationLogo() {
		DisplayMetrics metrics = getResources()
				.getDisplayMetrics();
		int height = metrics.heightPixels;

		TranslateAnimation tAnimation = new TranslateAnimation(0, 0, height, 10);

		tAnimation.setDuration(1200);
		tAnimation.setRepeatCount(0);
		tAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
		tAnimation.setFillAfter(true);
		tAnimation.setAnimationListener(new AnimationListener() {

			public void onAnimationStart(Animation animation) {
				MediaPlayer mp;
				setVolumeControlStream(AudioManager.STREAM_MUSIC); 
		        mp = MediaPlayer.create(LogoAnimationActivity.this, R.raw.start_up);
		        mp.start();
			}

			public void onAnimationRepeat(Animation animation) {
				//
			}

			public void onAnimationEnd(Animation animation) {
				MainCountDown countDown = new MainCountDown(600, 100);
				countDown.start();
			}
		});
		ivLogo.startAnimation(tAnimation);
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
