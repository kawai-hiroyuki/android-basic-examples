package com.example.camerasample;

import java.io.IOException;
import java.util.List;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.Size;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

public class SampleView extends SurfaceView implements Callback {

	public static final String TAG = "SampleView";
	
	private Camera camera;
	private SurfaceHolder holder;
	
	public SampleView(Context context) {
		super(context);
		holder = getHolder();
		holder.addCallback(this);
		//SurfaceHolder.setType()は廃止されたので不要（この機能は自動的に行われる）
		//holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int f, int w, int h) {
		
		Camera.Parameters p = camera.getParameters();		
		List<Size> previewSizes = camera.getParameters().getSupportedPreviewSizes();
	    Size size = previewSizes.get(0);
	    p.setPreviewSize(size.width, size.height);
	   
		camera.startPreview();		
	}

	@Override
	public void surfaceCreated(SurfaceHolder arg0) {
		try {
			camera = Camera.open();
			camera.setPreviewDisplay(holder);
		} catch(IOException e) {
		}
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		camera.stopPreview();
		camera.release();	
	}

}
