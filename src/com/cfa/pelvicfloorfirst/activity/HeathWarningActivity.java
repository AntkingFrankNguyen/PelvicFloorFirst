package com.cfa.pelvicfloorfirst.activity;

import com.cfa.pelvicfloorfirst.R;

import android.os.Bundle;

public class HeathWarningActivity extends BaseSimpleActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_heath_warning);
		super.onCreate(savedInstanceState);
		setTitle("HEATH WARNING");
		
		simpleBottomBarView.setTextLeftBtn("NO");
		simpleBottomBarView.setTextRightBtn("YES");
	}
}
