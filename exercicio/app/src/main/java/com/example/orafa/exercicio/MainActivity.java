package com.example.orafa.exercicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToast = (Button)findViewById(R.id.butao1);
        Button buttonTela = (Button)findViewById(R.id.butao2);
        final EditText editText1 = (EditText)findViewById(R.id.textoedit);

        buttonToast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplication(), editText1.getText().toString(), Toast.LENGTH_LONG ).show();
            }
        });

        buttonTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SegundaTela.class);
                startActivity(intent);
            }
        });
    }
}
