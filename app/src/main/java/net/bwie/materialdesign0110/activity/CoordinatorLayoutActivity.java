package net.bwie.materialdesign0110.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import net.bwie.materialdesign0110.R;

/**
 * CoordinatorLayout：协调者布局
 * 协调两个UI控件之间的滑动关系。实现两个UI控件的联动滑动有效果
 * 跟随控件会跟着依赖控件走
 * 1、实现Behavior类确定跟谁走，具体怎么跟
 * 2、在布局中使用layout_behavoir属性确定谁是跟随控件
 */
public class CoordinatorLayoutActivity extends AppCompatActivity implements View.OnClickListener {

    protected FloatingActionButton mFloatingActionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_coordinator_layout);
        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.floating_action_btn) {
            // 点击悬浮按钮，展示Snackbar

            final Snackbar snackbar = Snackbar.make(view, "asdasdasdassad", Snackbar.LENGTH_INDEFINITE);

            // 设置Snackbar点击动作事件
            snackbar.setAction("隐藏", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    snackbar.dismiss();// 隐藏
                    Toast.makeText(CoordinatorLayoutActivity.this, "sdfsdfsdf", Toast.LENGTH_SHORT).show();
                }
            });

            snackbar.show();
        }
    }

    private void initView() {
        mFloatingActionBtn = (FloatingActionButton) findViewById(R.id.floating_action_btn);
        mFloatingActionBtn.setOnClickListener(CoordinatorLayoutActivity.this);
    }
}
