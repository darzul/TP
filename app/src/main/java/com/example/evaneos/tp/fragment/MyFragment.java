package com.example.evaneos.tp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.evaneos.tp.R;

public class MyFragment extends Fragment {

    TextView mTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_layout,container, false);
        mTextView = (TextView) v.findViewById(R.id.my_text_view);
        mTextView.setText(getString(R.string.hello_world3));
        return v;
    }
}
