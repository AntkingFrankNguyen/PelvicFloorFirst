package com.cfa.pelvicfloorfirst.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cfa.pelvicfloorfirst.R;

public class TitleBarView extends LinearLayout {

	public TitleBarView(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.ui_titlebar, this, true);
	}

	public void setTitle(CharSequence title) {
		TextView tvTitle = (TextView) findViewById(R.id.tv_title_bar);
		tvTitle.setText(title);
	}
}
