package com.rosalvavenegas.contadorfragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Rosalva on 11/12/2017.
 */

public class ContadorFragment extends Fragment {
    private TextView mEtiquetaConteo;
    private EditText mCampoConteo;
    private Button mBotonConteo, mBotonReiniciar;
    int conteo = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_contador,container,false);

        mCampoConteo = (EditText) v.findViewById(R.id.campo_conteo);
        mBotonConteo = (Button) v.findViewById(R.id.boton_contar);
        mBotonReiniciar = (Button) v.findViewById(R.id.boton_reiniciar);

        mBotonConteo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteo++;
                mCampoConteo.setText("" + conteo);
            }
        });

        mBotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteo = 0;
                mCampoConteo.setText(""+ conteo);
            }
        });

        return v;
    }
}
