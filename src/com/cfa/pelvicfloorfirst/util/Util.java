package com.cfa.pelvicfloorfirst.util;

import com.cfa.pelvicfloorfirst.activity.AboutUsActivity;
import com.cfa.pelvicfloorfirst.activity.ExercisesInWorkoutActivity;
import com.cfa.pelvicfloorfirst.activity.HeathWarningActivity;
import com.cfa.pelvicfloorfirst.activity.HomeActivity;
import com.cfa.pelvicfloorfirst.activity.ImageOfExerciseActivity;
import com.cfa.pelvicfloorfirst.activity.IntroductionActivity;
import com.cfa.pelvicfloorfirst.activity.LinkActivity;
import com.cfa.pelvicfloorfirst.activity.LoginActivity;
import com.cfa.pelvicfloorfirst.activity.LoginWithAccountActivity;
import com.cfa.pelvicfloorfirst.activity.LogoAnimationActivity;
import com.cfa.pelvicfloorfirst.activity.OtherResourceActivity;
import com.cfa.pelvicfloorfirst.activity.PelvicFloorFirstActivity;
import com.cfa.pelvicfloorfirst.activity.SaveActivity;
import com.cfa.pelvicfloorfirst.activity.SelectMusicActivity;
import com.cfa.pelvicfloorfirst.activity.ShareActivity;
import com.cfa.pelvicfloorfirst.activity.SignUpActivity;
import com.cfa.pelvicfloorfirst.activity.StartActivity;
import com.cfa.pelvicfloorfirst.activity.StartTypeActivity;
import com.cfa.pelvicfloorfirst.activity.VideoOfExerciseActivity;
import com.cfa.pelvicfloorfirst.activity.WorkoutActivity;

import android.content.Context;
import android.content.Intent;

public class Util {

	public static void callActivity(Context mContext, int activityIntroduction) {
		Intent intent;
		switch (activityIntroduction) {
		case CommConstant.ACTIVITY_ABOUT_US:
			intent = new Intent(mContext, AboutUsActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_EXERCISES_IN_WORKOUT:
			intent = new Intent(mContext, ExercisesInWorkoutActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_HEATH_WARNING:
			intent = new Intent(mContext, HeathWarningActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_HOME:
			intent = new Intent(mContext, HomeActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_IMAGE_OF_EXERCISE:
			intent = new Intent(mContext, ImageOfExerciseActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_INTRODUCTION:
			intent = new Intent(mContext, IntroductionActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_LINK:
			intent = new Intent(mContext, LinkActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_LOGIN:
			intent = new Intent(mContext, LoginActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_LOGIN_WITH_ACCOUNT:
			intent = new Intent(mContext, LoginWithAccountActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_LOGO_ANIMATION:
			intent = new Intent(mContext, LogoAnimationActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_OTHER_RESOURCE:
			intent = new Intent(mContext, OtherResourceActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_PELVIC_FLOOR_FIRST:
			intent = new Intent(mContext, PelvicFloorFirstActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_SAVE:
			intent = new Intent(mContext, SaveActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_SELECT_MUSIC:
			intent = new Intent(mContext, SelectMusicActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_SHARE:
			intent = new Intent(mContext, ShareActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_SIGN_UP:
			intent = new Intent(mContext, SignUpActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_START:
			intent = new Intent(mContext, StartActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_START_TYPE:
			intent = new Intent(mContext, StartTypeActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_VIDEO_OF_EXERCISE:
			intent = new Intent(mContext, VideoOfExerciseActivity.class);
			mContext.startActivity(intent);
			break;
		case CommConstant.ACTIVITY_WORKOUT:
			intent = new Intent(mContext, WorkoutActivity.class);
			mContext.startActivity(intent);
			break;
		default:
			break;
		}
	}

}
