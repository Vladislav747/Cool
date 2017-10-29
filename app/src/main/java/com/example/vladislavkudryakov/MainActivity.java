package com.example.vladislavkudryakov;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.vladislavkudryakov.cool.R;

/**
 * Created by vladislavkudryakov on 29.10.17.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Let's set layout
        setContentView(R.layout.activity_main);
    }
}
