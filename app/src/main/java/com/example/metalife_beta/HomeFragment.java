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
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.metalife_beta.funcionalities.DivisasActivity;
import com.example.metalife_beta.funcionalities.UnderDevelopment;
import com.example.metalife_beta.funcionalities.ayuntamiento;
import com.example.metalife_beta.funcionalities.caixa;
import com.example.metalife_beta.funcionalities.cric;
import com.example.metalife_beta.funcionalities.maps;
import com.example.metalife_beta.funcionalities.mensajeria;
import com.example.metalife_beta.funcionalities.salud_responde;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {


    MainActivity mainActivity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_fragmet, container, false);


        mainActivity = (MainActivity)getActivity();


        Button button1 = view.findViewById(R.id.button1);
        Button button2 = view.findViewById(R.id.button2);
        Button button3 = view.findViewById(R.id.button3);

        ImageButton button4 = view.findViewById(R.id.imageButton1);
        ImageButton button5 = view.findViewById(R.id.imageButton2);
        ImageButton button6 = view.findViewById(R.id.imageButton3);
        ImageButton button7 = view.findViewById(R.id.imageButton4);
        ImageButton button8 = view.findViewById(R.id.imageButton5);
        ImageButton button9 = view.findViewById(R.id.imageButton6);
        ImageButton button10 = view.findViewById(R.id.imageButton7);
        ImageButton button11 = view.findViewById(R.id.imageButton8);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://clubroboticachurriana.com/webs/solucion#talleres"));
                startActivity(intent);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ayuntamiento.class);
                startActivity(intent);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.audicrea.com/"));
                startActivity(intent);
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), maps.class);
                startActivity(intent);
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), mensajeria.class);
                startActivity(intent);
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), salud_responde.class);
                startActivity(intent);
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), caixa.class);
                startActivity(intent);
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
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


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DivisasActivity.class);
                startActivity(intent);
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
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


        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/"));
                startActivity(intent);
            }
        });






        TextView textViewNombre = view.findViewById(R.id.textView1);
        TextView textViewFecha = view.findViewById(R.id.textView2);


        Calendar calendar = Calendar.getInstance();


        SimpleDateFormat day = new SimpleDateFormat("EEEE", new Locale("es", "ES"));
        SimpleDateFormat day_number = new SimpleDateFormat("d", new Locale("es", "ES"));
        SimpleDateFormat month = new SimpleDateFormat("MMMM", new Locale("es", "ES"));
        SimpleDateFormat year = new SimpleDateFormat("yyyy", new Locale("es", "ES"));

        String day_final = day.format(calendar.getTime());
        String day_number_final = day_number.format(calendar.getTime());
        String month_final = month.format(calendar.getTime());
        String year_final = year.format(calendar.getTime());


        String name = getActivity().getIntent().getStringExtra("name");

        textViewNombre.setText("¡Hola " + name + "!");
        textViewFecha.setText("Hoy es " + day_final + " " + day_number_final + " de " + month_final + " de " + year_final +  ". Un día para hacer grandes cosas.");


        return view;
    }


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }



    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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