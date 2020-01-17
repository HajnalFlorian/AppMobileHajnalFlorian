package com.example.monappli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tQuizz;
    private EditText eNameUti;
    private Button bJouer;
    private Utilisateur mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mQuiz = (TextView) findViewById(R.id.activity_main_Quiz);
        EditText mText= (EditText) findViewById(R.id.activity_main_Text);
        final Button mBouton= (Button) findViewById(R.id.activity_main_Bouton);
        mBouton.setEnabled(false);
        mText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mBouton.setEnabled(s.toString().length() !=0);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mBouton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent gameActivity = new Intent(MainActivity.this, Questionnaire.class);
                startActivity(gameActivity);
                mUser.setmFirstname(eNameUti.getText().toString());
            }

            }

    );
}}
