package com.hatenablog.rikisha.example;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	// �^�O���̓N���X���ɐݒ肷��̂���ʓI
	private static final String TAG = "MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		int hoge = 10;
		Log.println(Log.ASSERT, TAG, "�v���I�ȃG���[");
		Log.e(TAG, "Log.e�Ń��O�o��" + hoge);		// �G���[ (ERROR)
		Log.w(TAG, "Log.w�Ń��O�o��" + hoge);		// �x�� (WARN)
		Log.i(TAG, "Log.i�Ń��O�o��" + hoge);		// ��� (INFO)
		Log.d(TAG, "Log.d�Ń��O�o��" + hoge);		// �f�o�b�O�p (DEBUG)
		Log.v(TAG, "Log.v�Ń��O�o��" + hoge);		// �ڍ׏�� (VERBOSE)

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
