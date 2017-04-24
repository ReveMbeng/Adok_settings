package com.example.lmbongue.adok_project;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TwoFragment extends Fragment {
    Button Small,Large,Medium;
    GPIO gpio28; //pin resizing
    GPIO gpio19; //pin resizing
    GPIO gpio21; // pin linux
    GPIO gpio18; // pin linux

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_two, container, false);
        initUI(v);

        return v;
    }
    private void initUI(View v) {
        Small = (Button)v.findViewById(R.id.small);
        Medium = (Button)v.findViewById(R.id.medium);
        Large = (Button)v.findViewById(R.id.large);
        gpio19 = new GPIO(19);
        gpio28 = new GPIO(28);
       // gpio24 = new GPIO(24);
        gpio21 = new GPIO(21);
        gpio18 = new GPIO(18);

        Small.setOnClickListener(myhandler1);
        Medium.setOnClickListener(myhandler2);
        Large.setOnClickListener(myhandler3);
    }
    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
          // Odroid et Arduino
            gpio19.setState(0);
            gpio28.setState(1);
            // Odroid et linux
            gpio21.setState(0);
            gpio18.setState(1);
        }



    };
    View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {
            // Odroid et Arduino
            gpio19.setState(1);
            gpio28.setState(0);
            // Odroid et linux
            gpio21.setState(1);
            gpio18.setState(0);

        }

    };
    View.OnClickListener myhandler3 = new View.OnClickListener() {
        public void onClick(View v) {
          // Odroid et Arduino
            gpio19.setState(0);
            gpio28.setState(0);
            // Odroid et linux
            gpio21.setState(0);
            gpio18.setState(0);
        }

    };

}
