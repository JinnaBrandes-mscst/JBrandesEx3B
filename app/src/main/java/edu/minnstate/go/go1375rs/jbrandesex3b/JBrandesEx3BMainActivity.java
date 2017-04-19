package edu.minnstate.go.go1375rs.jbrandesex3b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JBrandesEx3BMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jbrandes_ex3_bmain);


        // ---------- loop1Button event handler ----------
        Button loop1Button = (Button) findViewById(R.id.loop1Button);

        loop1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                do_loop1Button_onClick(v);
            }
        });

        // ---------- loop2Button event handler ----------
        Button loop2Button = (Button) findViewById(R.id.loop2Button);

        loop2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                do_loop2Button_onClick(v);
            }
        });

        // ---------- loop3Button event handler ----------
        Button loop3Button = (Button) findViewById(R.id.loop3Button);

        loop3Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                do_loop3Button_onClick(v);
            }
        });

        // ---------- loop4Button event handler ----------
        Button loop4Button = (Button) findViewById(R.id.loop4Button);

        loop4Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                do_loop4Button_onClick(v);
            }
        });
    }

    protected void do_loop1Button_onClick(View v) {
        // Get references to EditText boxes
        EditText inputNumbersEditText = (EditText) findViewById(R.id.inputNumbersEditText);
        EditText loopResultEditText = (EditText) findViewById(R.id.outputNumbersText);

        // Get user's input
        inputNumbersEditText.getText().toString();

        //Display result
        Loops loops = new Loops(inputNumbersEditText.getText().toString());
        loopResultEditText.setText(loops.loop1());
    }

    protected void do_loop2Button_onClick(View v) {
        // Get references to EditText boxes
        EditText inputNumbersEditText = (EditText) findViewById(R.id.inputNumbersEditText);
        EditText loopResultEditText = (EditText) findViewById(R.id.outputNumbersText);

        // Get user's input
        inputNumbersEditText.getText().toString();

        //Display result
        Loops loops = new Loops(inputNumbersEditText.getText().toString());
        loopResultEditText.setText(loops.loop2());
    }

    protected void do_loop3Button_onClick(View v) {
        // Get references to EditText boxes
        EditText inputNumbersEditText = (EditText) findViewById(R.id.inputNumbersEditText);
        EditText loopResultEditText = (EditText) findViewById(R.id.outputNumbersText);

        // Get user's input
        inputNumbersEditText.getText().toString();

        //Display result
        Loops loops = new Loops(inputNumbersEditText.getText().toString());
        loopResultEditText.setText(loops.loop3());
    }

    protected void do_loop4Button_onClick(View v) {
        // Get references to EditText boxes
        EditText inputNumbersEditText = (EditText) findViewById(R.id.inputNumbersEditText);
        EditText loopResultEditText = (EditText) findViewById(R.id.outputNumbersText);

        // Get user's input
        inputNumbersEditText.getText().toString();

        //Display result
        Loops loops = new Loops(inputNumbersEditText.getText().toString());
        loopResultEditText.setText(loops.loop4());
    }
}
