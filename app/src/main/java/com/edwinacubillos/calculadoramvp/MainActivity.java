package com.edwinacubillos.calculadoramvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IMain.view {

    private EditText eNumero1, eNumero2;
    private TextView tTotal;

    private IMain.presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        eNumero1 = findViewById(R.id.eNumero1);
        eNumero2 = findViewById(R.id.eNumero2);
        tTotal = findViewById(R.id.tTotal);
    }

    public void sumar(View view) {
        presenter.sumar(eNumero1.getText().toString(), eNumero2.getText().toString());
    }


    @Override
    public void mostrarResultado(int total) {
        tTotal.setText(String.valueOf(total));
    }

    @Override
    public void mostrarError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
