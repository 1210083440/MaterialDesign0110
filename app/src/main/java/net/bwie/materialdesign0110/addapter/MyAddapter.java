package net.bwie.materialdesign0110.addapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.bwie.materialdesign0110.R;

import java.util.ArrayList;
import java.util.List;

public class MyAddapter extends RecyclerView.Adapter<MyAddapter.ViewHolder> {

    private Context mContext;
    private List<String> mDatas;

    public MyAddapter(Context context) {
        mContext = context;

        // 我们直接在构造方法里初始化数据
        mDatas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mDatas.add("数据：" + i);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.item_title, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String data = mDatas.get(position);

        holder.mTextView.setText(data);
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            mTextView = itemView.findViewById(R.id.text_view);
        }
    }

}
