package net.bwie.materialdesign0110.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import net.bwie.materialdesign0110.R;

/**
 * 泛型填写child控件的类型
 * 1、必须重写构造方法，否则报错
 * 2、确定我要跟谁走
 * 3、确定我怎么跟
 */
public class FollowBehavior extends CoordinatorLayout.Behavior<TextView> {

    public FollowBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    // 确定跟谁走
    // parent：当前控件所在容器
    // child：跟随的控件
    // dependency：被跟随的控件
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, TextView child, View dependency) {
//        return super.layoutDependsOn(parent, child, dependency);
        // 如果被跟随控件的id满足我们的需求，就跟他走
        return dependency.getId() == R.id.dependency_view;
    }

    // 当被依赖视图位置发生变化时的监听：怎么跟
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, TextView child, View dependency) {
        // child控件永远展示在被依赖视图的下方
        // 获取被依赖视图的坐标
        // 设置给child上
        float childX = dependency.getX();
        float childY = dependency.getY() + dependency.getHeight();

        child.setX(childX);
        child.setY(childY);

        child.setText("x : " + childX + ", y : " + childY);

        return true;
    }
}
