package com.example.evaneos.tp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.evaneos.tp.R;

public class MyFragment extends Fragment {

    RecyclerView mList;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_layout, container, false);
        mList = (RecyclerView) v.findViewById(R.id.list);
        mList.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;
    }
}
