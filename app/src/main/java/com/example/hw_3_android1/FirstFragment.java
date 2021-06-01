package com.example.hw_3_android1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment {

    private EditText editText;
    private Button button;



    public FirstFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        editText = view.findViewById(R.id.edit_text);
        button = view.findViewById(R.id.button_first);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, SecondFragment.newInstance(text)).addToBackStack("SecondFragment").commit();
//                getChildFragmentManager().beginTransaction().replace(, SecondFragment.newInstance(text)).commit();
            }
        });
        return view;
    }
}