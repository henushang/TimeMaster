package com.henushang.timemaster.service;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.util.Log;

/**
 * 对手机当前的app进行检测的线程，并且做相应的处理
 * @author henushang
 *
 */
public class CheckAppThread extends Activity implements Runnable{

	@Override
	public void run() {
		while (true) {
			ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);  
			ComponentName cn = am.getRunningTasks(1).get(0).topActivity;  
			Log.d("", "pkg:"+cn.getPackageName());  
			Log.d("", "cls:"+cn.getClassName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}

}
