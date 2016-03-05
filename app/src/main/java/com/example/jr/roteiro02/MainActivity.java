package com.example.jr.roteiro02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tradutorGeral (View view) {
        traduzir("TRADUZIR", null);
    }
    public void traduzirIngles (View view) {
        traduzir("TRADUZIR", "INGLES");
    }
    public void traduzirFrances (View view) {
        traduzir("TRADUZIR", "FRANCES");
    }

    private void traduzir(String acao, String categoria){
        EditText mTexto = (EditText) findViewById(R.id.texto);
        String texto = mTexto.getText().toString();
        View focus = null;

        if(texto.equalsIgnoreCase("Azul") == false && texto.equalsIgnoreCase("Amarelo") == false && texto.equalsIgnoreCase("Vermelho") == false){
            mTexto.setError("Azul, Amarelo ou Vermelho");
            focus = mTexto;
            focus.requestFocus();
        } else {
            Intent i = new Intent(acao);
            if (categoria != null) {
                i.addCategory(categoria);
            }
            Bundle b = new Bundle();
            b.putString("cor", texto);
            i.putExtras(b);
            startActivity(i);
        }
    }
}
