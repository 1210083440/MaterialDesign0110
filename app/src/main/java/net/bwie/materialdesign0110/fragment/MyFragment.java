package net.bwie.materialdesign0110.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.bwie.materialdesign0110.R;
import net.bwie.materialdesign0110.addapter.MyAddapter;

public class MyFragment extends Fragment {

    protected View rootView;
    protected RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);
        initView(rootView);
        return rootView;
    }

    private void initView(View rootView) {
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        MyAddapter addapter = new MyAddapter(getContext());
        mRecyclerView.setAdapter(addapter);
    }

}
