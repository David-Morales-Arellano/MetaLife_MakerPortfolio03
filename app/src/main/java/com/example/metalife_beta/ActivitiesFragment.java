package com.example.metalife_beta;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.metalife_beta.funcionalities.AyudaDomicilio;
import com.example.metalife_beta.funcionalities.DivisasActivity;
import com.example.metalife_beta.funcionalities.ayuntamiento;
import com.example.metalife_beta.funcionalities.caixa;
import com.example.metalife_beta.funcionalities.maps;
import com.example.metalife_beta.funcionalities.mensajeria;
import com.example.metalife_beta.funcionalities.myAudi;
import com.example.metalife_beta.funcionalities.salud_responde;
import com.example.metalife_beta.funcionalities.myAudi;

public class ActivitiesFragment extends Fragment {

    MainActivity mainActivity;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_activities, container, false);


        mainActivity = (MainActivity)getActivity();

        Button button1 = view.findViewById(R.id.button51);
        Button button2 = view.findViewById(R.id.button52);
        Button button3 = view.findViewById(R.id.button53);
        Button button4 = view.findViewById(R.id.button54);
        Button button5 = view.findViewById(R.id.button55);
        Button button6 = view.findViewById(R.id.button56);
        Button button7 = view.findViewById(R.id.button57);
        Button button8 = view.findViewById(R.id.button58);
        Button button9 = view.findViewById(R.id.button59);
        Button button10 = view.findViewById(R.id.button60);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), maps.class);
                startActivity(intent);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), mensajeria.class);
                startActivity(intent);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), salud_responde.class);
                startActivity(intent);
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.caixabank.es/particular/home/particulares_es.html"));
                startActivity(intent);
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DivisasActivity.class);
                startActivity(intent);
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(Settings.ACTION_SETTINGS);
                    startActivity(intent);
                    Log.i(TAG, "todo va bien");
                }

                catch (Exception e) {
                    e.printStackTrace();
                    Log.i(TAG, "todo va mal");
                }
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com"));
                startActivity(intent);
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/"));
                startActivity(intent);
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), myAudi.class);
                startActivity(intent);
            }
        });


        return view;


    }

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    public static ActivitiesFragment newInstance(String param1, String param2) {
        ActivitiesFragment fragment = new ActivitiesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }
    }
}
