package dev.kaua.makingplans.Activities.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import dev.kaua.makingplans.R;
import dev.kaua.makingplans.Tools.BarsColor;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        BarsColor.Init(this);
        BarsColor.SetColor(this, getColor(R.color.base));

        findViewById(R.id.btnUsperySplash).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://uspery.com"))));

        // While the app is under development you can choose what
        //  Screen will open here, all that you need to do is change
        //  the variable intent
        Class<?> intent = SplashActivity.class;
        if(intent != SplashActivity.class)
            startActivity(new Intent(this, intent));

    }
}