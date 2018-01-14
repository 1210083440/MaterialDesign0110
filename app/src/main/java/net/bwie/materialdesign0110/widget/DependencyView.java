package net.bwie.materialdesign0110.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * 被依赖视图
 * 跟随手指滑动
 * 检测手指在屏幕中的坐标
 * 将手指坐标设置给当前视图
 */
public class DependencyView extends android.support.v7.widget.AppCompatTextView {

    public DependencyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    // 监听触摸事件


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // 根据不同的手势做不同的动作
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:// 手指放下
                Log.d("1510", "手指放下");
                break;
            case MotionEvent.ACTION_MOVE:// 手指移动
                Log.d("1510", "x: " + event.getRawX() + ", y: " + event.getRawY());
            // 将手指坐标设置给当前视图，即可实现跟随手指滑动效果
                setX(event.getRawX());
                setY(event.getY());
                break;
            case MotionEvent.ACTION_UP:// 手指抬起
                Log.d("1510", "手指抬起");
                break;
        }
        return true;
    }
}
