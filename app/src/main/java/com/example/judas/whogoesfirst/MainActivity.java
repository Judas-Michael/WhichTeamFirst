package com.example.judas.whogoesfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private
    Button mTapHereButton; //taphere global variable
    TextView sTeam_Picker;
    TextView Team1Prompt;
    TextView Team2Prompt;
    EditText Team1Text;
    EditText Team2Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTapHereButton = (Button) findViewById(R.id.mtap_here_button); //defines variables vvv
        Team1Prompt = (TextView) findViewById(R.id.Team1Prompt);
        Team2Prompt = (TextView) findViewById(R.id.Team2Prompt);
        Team1Text = (EditText) findViewById(R.id.Team1Text);
        Team2Text = (EditText) findViewById(R.id.Team2Text);
        sTeam_Picker = (TextView) findViewById(R.id.sTeam_Picker); // same fpr sTeam_2
        sTeam_Picker.setVisibility(View.INVISIBLE);

        addEventListeners();
    }
    //configure event listeners
    private void addEventListeners(){

        mTapHereButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showRandomTeam();
            }
        });

        sTeam_Picker.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                reset();
            }
        });

}
    //this will pick which arrow to make visible
    private void showRandomTeam() {
        //makes button visible
        mTapHereButton.setVisibility(View.GONE);
        //creates randomness and assigns number
        int random = new Random().nextInt(2);
        //shows Team1 if number = 0
        if (random == 0) {
            sTeam_Picker.setText(Team1Text.getText().toString());
            sTeam_Picker.setVisibility(View.VISIBLE);
        } else {
            sTeam_Picker.setText(Team2Text.getText().toString());
            sTeam_Picker.setVisibility(View.VISIBLE);
        }
    }

    private void reset() {
        //removes

        //shows tap Here
        mTapHereButton.setVisibility(View.VISIBLE);
    }





}
