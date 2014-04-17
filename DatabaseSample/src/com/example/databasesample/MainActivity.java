package com.example.databasesample;

import java.io.FileNotFoundException;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
	private Button button;
	
	private int DB_VERSION = 1;
	private int DB_MODE = Context.MODE_PRIVATE;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (Button)findViewById(R.id.button);
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
		SQLiteDatabase db;
		try {
			db = createDatabase("db01_01", DB_VERSION, DB_MODE, null);
		}catch(FileNotFoundException e){
			db = null;
		}
	}

}
