package com.example.orafa.exercicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.butao1 = (Button) findViewById(R.id.butao1);
        this.mViewHolder.butao2 = (Button) findViewById(R.id.butao2);
        this.mViewHolder.textoedit = (EditText) findViewById(R.id.textoedit);

        this.mViewHolder.butao1.setOnClickListener(this);
        this.mViewHolder.butao2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.butao1:
                Toast.makeText(getApplication(), mViewHolder.textoedit.getText().toString(), Toast.LENGTH_LONG).show();
                break;
            case R.id.butao2:
                Intent intent = new Intent(this, SegundaTela.class);
                startActivity(intent);
                break;
        }
    }

    private static class ViewHolder {
        Button butao1;
        Button butao2;
        EditText textoedit;
    }
}
