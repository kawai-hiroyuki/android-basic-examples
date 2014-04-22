package com.example.imagefromgallery;

import java.io.FileNotFoundException;
import java.io.InputStream;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {

	// インテント識別用のコード（値は任意です。）
	private static final int REQUEST_CODE = 1;
	
	private ImageView mImageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(this);
		mImageView = (ImageView)findViewById(R.id.imageView1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Button button = (Button)v;
		if(button.getId() == R.id.button1) {
			Intent intent = new Intent(Intent.ACTION_PICK);
			intent.setType("image/*");
			startActivityForResult(intent, REQUEST_CODE);
		}
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// 選択された画像のUriを取得
		Uri uri = data.getData();
		
		BitmapFactory.Options options = new BitmapFactory.Options();
		// 縮小する倍率をセット
		options.inSampleSize = 2;
		
		InputStream is;
		try {
			is = getContentResolver().openInputStream(uri);
			// Bitmapを生成
			Bitmap bitmap = BitmapFactory.decodeStream(is, null, options);
			mImageView.setImageBitmap(bitmap);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
