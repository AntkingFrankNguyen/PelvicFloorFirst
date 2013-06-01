package com.cfa.pelvicfloorfirst.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.cfa.pelvicfloorfirst.R;

public class PelvicFloorFirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pelvic_floor_first);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_pelvic_floor_first, menu);
		return true;
	}

}
