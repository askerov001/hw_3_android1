package com.example.hw_3_android1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class FifthFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    private Button button;
    private TextView textView;

    public FifthFragment() {
        // Required empty public constructor
    }

    public static FifthFragment newInstance(String text) {
        FifthFragment fragment = new FifthFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fifth, container, false);
        textView = view.findViewById(R.id.result_txt);
        textView.setText(mParam1);
        return view;
    }
}