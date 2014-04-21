package org.ak2048.game;

import org.apache.cordova.Config;
import org.apache.cordova.CordovaActivity;
import com.google.ads.*;
import android.widget.LinearLayout;

import android.os.Bundle;

public class MainActivity extends CordovaActivity 
{
	private static final String AdMob_Ad_Unit = "ca-app-pub-4231817588171293/4917918965";
	private AdView adView;
	
    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();

        super.loadUrl(Config.getStartUrl());

        adView = new AdView(this, AdSize.BANNER, AdMob_Ad_Unit); 
        LinearLayout layout = super.root;
        layout.addView(adView); 
        AdRequest request = new AdRequest();
        request.setTesting(false);
        adView.loadAd(request);
    }
}
