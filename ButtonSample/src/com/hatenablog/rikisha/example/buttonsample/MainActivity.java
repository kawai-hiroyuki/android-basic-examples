package com.hatenablog.rikisha.example.buttonsample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Button button = (Button) v;
		// 画面上に通知を表示する
        Toast.makeText(MainActivity.this, "onClick()",
                Toast.LENGTH_SHORT).show();
        // ボタンの表示文字をButtonからClick!に変更する
        button.setText("Click!");
	}

}
