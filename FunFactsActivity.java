package com.example.fwise.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    // Declare our view variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativelayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativelayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();
                // Update the screen with our new fact
                factTextView.setText(fact);

                int color = colorWheel.getColor();
                relativelayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

        //Toast.makeText(this, "Activity Created.", Toast.LENGTH_SHORT).show();

    }
}
