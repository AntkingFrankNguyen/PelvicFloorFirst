package com.cfa.pelvicfloorfirst.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.cfa.pelvicfloorfirst.R;
import com.cfa.pelvicfloorfirst.activity.HeathWarningActivity;
import com.cfa.pelvicfloorfirst.activity.IntroductionActivity;
import com.cfa.pelvicfloorfirst.activity.OtherResourceActivity;
import com.cfa.pelvicfloorfirst.util.CommConstant;
import com.cfa.pelvicfloorfirst.util.Util;

public class SimpleBottomBarView extends RelativeLayout implements
		OnClickListener {

	private Context mContext;
	private Button btnLeft;
	private Button btnRight;

	public SimpleBottomBarView(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.ui_simple_bottom_bar,
				this, true);
		mContext = context;

		btnLeft = (Button) findViewById(R.id.btn_left);
		btnRight = (Button) findViewById(R.id.btn_right);

		btnLeft.setOnClickListener(this);
		btnRight.setOnClickListener(this);
	}

	public void setOnBtnLeftClickListener(OnClickListener onClickListener) {
		btnLeft.setOnClickListener(onClickListener);
	}

	public void setOnBtnRightClickListener(OnClickListener onClickListener) {
		btnRight.setOnClickListener(onClickListener);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_left:
			if (mContext instanceof HeathWarningActivity) {
				Util.callActivity(mContext, CommConstant.ACTIVITY_OTHER_RESOURCE);
			} else if (mContext instanceof OtherResourceActivity) {
				((OtherResourceActivity) mContext).finish();
			}
			break;
		case R.id.btn_right:
			if (mContext instanceof IntroductionActivity) {
				Util.callActivity(mContext, CommConstant.ACTIVITY_HEATH_WARNING);
			} else if (mContext instanceof HeathWarningActivity) {
				Util.callActivity(mContext, CommConstant.ACTIVITY_HOME);
			}
			break;
		default:
			break;
		}
	}

	public void setTextLeftBtn(String string) {
		btnLeft.setText(string);
	}

	public void setTextRightBtn(String string) {
		btnRight.setText(string);
	}

}
