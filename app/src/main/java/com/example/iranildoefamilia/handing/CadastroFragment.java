package com.example.iranildoefamilia.handing;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class CadastroFragment extends Fragment {

    private EditText nome;
    private EditText sobrenome;
    private EditText telefone;
    private EditText login;
    private EditText senha;

    public CadastroFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cadastro, container, false);
        nome = (EditText) view.findViewById(R.id.editText4);
        sobrenome = (EditText) view.findViewById(R.id.editText5);
        telefone = (EditText) view.findViewById(R.id.editText6);
        login = (EditText) view.findViewById(R.id.editText7);
        senha = (EditText) view.findViewById(R.id.editText8);
        Button button = (Button) view.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Principal.class));
            }
        });
        return view;
    }
}
