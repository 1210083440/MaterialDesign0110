package net.bwie.materialdesign0110.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.bwie.materialdesign0110.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button mCoordinatorLayoutBtn;
    protected Button mAppbarLayoutBtn;
    protected Button mCollapsingToolbarLayoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        if (view.getId() == R.id.coordinator_layout_btn) {
            intent.setClass(this, CoordinatorLayoutActivity.class);
        } else if (view.getId() == R.id.appbar_layout_btn) {
            intent.setClass(this, AppBarLayoutActivity.class);
        } else if (view.getId() == R.id.collapsing_toolbar_layout_btn) {
            intent.setClass(this, CollapsingToolbarLayoutActivity.class);
        }
        startActivity(intent);
    }

    private void initView() {
        mCoordinatorLayoutBtn = (Button) findViewById(R.id.coordinator_layout_btn);
        mCoordinatorLayoutBtn.setOnClickListener(MainActivity.this);
        mAppbarLayoutBtn = (Button) findViewById(R.id.appbar_layout_btn);
        mAppbarLayoutBtn.setOnClickListener(MainActivity.this);
        mCollapsingToolbarLayoutBtn = (Button) findViewById(R.id.collapsing_toolbar_layout_btn);
        mCollapsingToolbarLayoutBtn.setOnClickListener(MainActivity.this);
    }
}
