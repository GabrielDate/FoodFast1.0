package br.com.etecia.foodfast;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PorcoesFragment extends Fragment {
    //variaveis
    EditText edtPoroes;
    Button btnEscolha;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_porcoes, container, false);

        edtPoroes = view.findViewById(R.id.edtPorcoes);
        btnEscolha = view.findViewById(R.id.btnEscolha);

        btnEscolha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = edtPoroes.getText().toString();
                Toast.makeText(getContext(), "Você escolheu" + nome,Toast.LENGTH_SHORT).show();

            }
        });

        //digitar o codigo a cima do return
        return view;
    }
}