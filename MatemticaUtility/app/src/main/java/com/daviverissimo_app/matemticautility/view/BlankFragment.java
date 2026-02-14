package com.daviverissimo_app.matemticautility.view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.daviverissimo_app.matemticautility.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class BlankFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_buttons_calculadora, container, false);

        // Referenciando os botões do layout do fragmento
        Button btn1 = view.findViewById(R.id.btn1);
        Button btn2 = view.findViewById(R.id.btn2);
        Button btn3 = view.findViewById(R.id.btn3);
        Button btn4 = view.findViewById(R.id.btn4);
        Button btn5 = view.findViewById(R.id.btn5);
        Button btn6 = view.findViewById(R.id.btn6);
        Button btn7 = view.findViewById(R.id.btn7);
        Button btn8 = view.findViewById(R.id.btn8);
        Button btn9 = view.findViewById(R.id.btn9);
        // Referencie os outros botões da mesma forma...

        // Configurando listeners para os botões, se necessário
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica do clique no botão 7
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica do clique no botão 7
            }
        });
        // Configurando listeners para os botões
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar um Toast quando o botão 3 for clicado
                Toast.makeText(getActivity(), "Botão 3 clicado!", Toast.LENGTH_SHORT).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar um Toast quando o botão 4 for clicado
                Toast.makeText(getActivity(), "Botão 4 clicado!", Toast.LENGTH_SHORT).show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar um Toast quando o botão 5 for clicado
                Toast.makeText(getActivity(), "Botão 5 clicado!", Toast.LENGTH_SHORT).show();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar um Toast quando o botão 6 for clicado
                Toast.makeText(getActivity(), "Botão 6 clicado!", Toast.LENGTH_SHORT).show();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica do clique no botão 7
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica do clique no botão 8
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica do clique no botão 9
            }
        });
        // Configurar os outros listeners dos botões, se necessário...

        return view;
    }}
