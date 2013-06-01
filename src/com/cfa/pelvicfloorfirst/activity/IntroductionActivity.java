package com.cfa.pelvicfloorfirst.activity;

import com.cfa.pelvicfloorfirst.R;

import android.os.Bundle;

public class IntroductionActivity extends BaseSimpleActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_introduction);
		super.onCreate(savedInstanceState);
		
		setTitle("NAME OF APP");
		
		simpleBottomBarView.setTextLeftBtn("REPLAY");
		simpleBottomBarView.setTextRightBtn("NEXT");
	}
}
