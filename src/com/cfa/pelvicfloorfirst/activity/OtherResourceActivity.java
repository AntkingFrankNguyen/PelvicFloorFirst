package com.cfa.pelvicfloorfirst.activity;

import com.cfa.pelvicfloorfirst.R;

import android.os.Bundle;

public class OtherResourceActivity extends BaseSimpleActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_other_resource);
		super.onCreate(savedInstanceState);
		setTitle("OTHER RESOURCES");
		
		simpleBottomBarView.setTextLeftBtn("OK AND CLOSE");
	}
}
