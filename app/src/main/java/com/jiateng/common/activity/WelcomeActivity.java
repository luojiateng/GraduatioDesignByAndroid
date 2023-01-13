package com.jiateng.common.activity;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static com.jiateng.common.utils.Const.ONE_SECOND;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.jiateng.R;
import com.lidroid.xutils.ViewUtils;

/**
 * @author LuoJiateng
 */
public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ViewUtils.inject(this);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
            finish();
        }, (long) (0.3 * ONE_SECOND));
    }
}