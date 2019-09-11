package com.tony.whoisfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button randomTeam;
    private EditText teamOne;
    private EditText teamTwo;
    private TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomTeam = findViewById(R.id.randomButton);
        teamOne = findViewById(R.id.teamOne);
        teamTwo = findViewById(R.id.teamTwo);
        results = findViewById(R.id.results);


     randomTeam.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            String one = teamOne.getText().toString();
            String two = teamTwo.getText().toString();
            // button listener when user presses random, reading each text field
             if (one.isEmpty() || two.isEmpty()) {
                 Toast confirmation = Toast.makeText(MainActivity.this, "Please enter a name for both text fields", Toast.LENGTH_LONG);
                 confirmation.show();
             }
             Random randomno = new Random();
             boolean value = randomno.nextBoolean();
                // random boolean
             if (value){
                 results.setText(one);
                //if "true" than we show first team
             }else{
                 results.setText(two);
                 // else we show second
             }


         }
     });

    }
}
