package com.example.vladislavkudryakov;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.vladislavkudryakov.cool.R;

/**
 * Created by vladislavkudryakov on 29.10.17.
 */

public class MainActivity extends Activity {
    //initizialise toolbar

    private Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Let's set layout
        setContentView(R.layout.activity_main);

        initToolbar();
    }

    private void initToolbar() {
        //let's give a link on our Element Toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem){


            }
        );
    }
    }
}
