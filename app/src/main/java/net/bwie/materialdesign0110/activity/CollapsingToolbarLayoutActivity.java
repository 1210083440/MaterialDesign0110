package net.bwie.materialdesign0110.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import net.bwie.materialdesign0110.R;
import net.bwie.materialdesign0110.addapter.MyPagerAdapter;
import net.bwie.materialdesign0110.fragment.MyFragment;

import java.util.ArrayList;
import java.util.List;

public class CollapsingToolbarLayoutActivity extends AppCompatActivity {

    protected ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_collapsing_toolbar_layout);
        initView();
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        List<Fragment> fgtList = new ArrayList<>();
        fgtList.add(new MyFragment());

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(),
                fgtList);

        mViewPager.setAdapter(adapter);
    }
}
