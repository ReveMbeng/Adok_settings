package com.example.lmbongue.adok_project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
public class threeFragment extends Fragment {
    Frame  frame = new Frame();
    Button very_low;
    Button low ;
    Button high;
    Button very_high;
    String start = "echo 1 > /sys/class/gpio/gpio209/value";
    String stop = "echo 0 > /sys/class/gpio/gpio209/value";
    String sleep1 ="sleep 0.002";
    String sleep2 = "sleep 0.001";
    String etat0 =  "echo 0 > /sys/class/gpio/gpio209/value";
    String etat1 =  "echo 1 > /sys/class/gpio/gpio209/value";

    public threeFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_three, container, false);
        initUI(v);
        return v;
    }
    private void initUI(View v) {
        very_low = (Button)v.findViewById(R.id.button2);
        low = (Button)v.findViewById(R.id.button3);
        high = (Button)v.findViewById(R.id.button4);
        very_high = (Button) v.findViewById(R.id.button5);

        very_low.setOnClickListener(myhandler1);
        low.setOnClickListener(myhandler2);
        high.setOnClickListener(myhandler3);
        very_high.setOnClickListener(myhandler4);
    }
    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
            String[] commands = {
                    start,
                    sleep1,
                    etat0,
                    sleep2,
                    etat0,
                    sleep2,
                    stop,
                    sleep1
            };
            frame.execCommands(commands);
        }



    };
    View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {
            String[] commands = {

                    //"cd /data/local",
                    start,
                    sleep1,
                    etat0,
                    sleep2,
                    etat1,
                    sleep2,
                     stop,
                     sleep1
            };

            frame.execCommands(commands);
        }

    };
    View.OnClickListener myhandler3 = new View.OnClickListener() {
        public void onClick(View v) {
          String[] commands = {
                  start,
                  sleep1,
                  etat1,
                  sleep2,
                  etat0,
                  sleep2,
                  stop,
                  sleep1
            };
            frame.execCommands(commands);
        }

    };
    View.OnClickListener myhandler4 = new View.OnClickListener() {
        public void onClick(View v) {
           String[] commands = {
                   start,
                   sleep1,
                   etat1,
                   sleep2,
                   etat1,
                   sleep2,
                   stop,
                   sleep1
            };
            frame.execCommands(commands);
        }

    };
}
