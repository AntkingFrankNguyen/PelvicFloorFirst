package com.cfa.pelvicfloorfirst.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.cfa.pelvicfloorfirst.R;

public class NavigationBarView extends LinearLayout {

	public NavigationBarView(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.ui_navigation_bar, this, true);
	}

}
