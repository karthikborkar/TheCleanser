package com.facebook.samples.hellofacebook;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
	//MediaPlayer song;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		//song = MediaPlayer.create(Splash.this, R.raw.sound1);
	//	song.start();
		Thread timer = new Thread() {

			@Override
			public void run() {
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent openMain = new Intent("android.intent.action.MENU");
					startActivity(openMain);
				}
			}

		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		//song.release();

		finish();
	}

}
