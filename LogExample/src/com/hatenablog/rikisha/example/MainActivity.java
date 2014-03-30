package com.hatenablog.rikisha.example;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	// タグにはクラス名にするのが一般的
	private static final String TAG = "MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		int hoge = 10;
		Log.println(Log.ASSERT, TAG, "致命的なエラー");
		Log.e(TAG, "Log.eで出力" + hoge);		// エラー (ERROR)
		Log.w(TAG, "Log.wで出力" + hoge);		// 警告 (WARN)
		Log.i(TAG, "Log.iで出力" + hoge);		// 情報 (INFO)
		Log.d(TAG, "Log.dで出力" + hoge);		// デバッグ (DEBUG)
		Log.v(TAG, "Log.vで出力" + hoge);		// 詳細情報 (VERBOSE)

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
