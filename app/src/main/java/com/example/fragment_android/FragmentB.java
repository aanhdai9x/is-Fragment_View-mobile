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

public class FragmentB extends Fragment {
    TextView txtB;
    EditText edtB;
    Button btnB;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        txtB = (TextView) view.findViewById(R.id.textViewFragB);
        edtB = (EditText) view.findViewById(R.id.editTextFragB);
        btnB = (Button) view.findViewById(R.id.buttonFragB);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtA = (TextView) getActivity().findViewById(R.id.textViewFragA);
                txtA.setText(edtB.getText().toString());
            }
        });

        return view;
    }
}
