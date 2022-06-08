package dev.kaua.makingplans.Tools;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;

public class BarsColor {
    static int defaultStatusBarColor = 999;

    public static void Init(@NonNull Activity context){
        final Window window = context.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        defaultStatusBarColor = window.getStatusBarColor();
    }

    public static void ResetColor(@NonNull Activity context){
        if(defaultStatusBarColor == 999)
            Init(context);
        context.getWindow().setStatusBarColor(defaultStatusBarColor);
        context.getWindow().setNavigationBarColor(defaultStatusBarColor);
    }

    public static void SetColor(@NonNull Activity context, int color){
        context.getWindow().setStatusBarColor(color);
        context.getWindow().setNavigationBarColor(color);
    }
}
