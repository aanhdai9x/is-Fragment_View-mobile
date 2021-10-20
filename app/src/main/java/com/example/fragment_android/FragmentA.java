package com.example.fragment_android;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class FragmentA extends Fragment {
    TextView txtA;
    EditText edtA;
    Button btnA;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a, container, false);

        txtA = (TextView) view.findViewById(R.id.textViewFragA);
        edtA = (EditText) view.findViewById(R.id.editTextFragA);
        btnA = (Button) view.findViewById(R.id.buttonFragA);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtMain = (TextView) getActivity().findViewById(R.id.textViewMain);
                txtMain.setText(edtA.getText().toString());
            }
        });

        return view;
    }

    public void ganNoiDung(String noidung){
        txtA.setText(noidung);
    }

}
