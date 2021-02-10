package lt.vtmc.devintas_praktinis_darbas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout11;
    private LinearLayout linearLayout12;
    private LinearLayout linearLayout13;
    private LinearLayout linearLayout14;
    private Button buttonRed;
    private Button buttonGreen;
    private Button buttonBlue;
    private Button buttonYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout11 = findViewById(R.id.linearLayout11);
        linearLayout12 = findViewById(R.id.linearLayout12);
        linearLayout13 = findViewById(R.id.linearLayout13);
        linearLayout14 = findViewById(R.id.linearLayout14);
        buttonBlue = findViewById(R.id.buttonBlue);
        buttonRed = findViewById(R.id.buttonRed);
        buttonGreen = findViewById(R.id.buttonGreen);
        buttonYellow = findViewById(R.id.buttonYellow);
        int selectedColor = Color.rgb(237,231,231);

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout11.setBackgroundColor(Color.GREEN);
                linearLayout12.setBackgroundColor(selectedColor);
                linearLayout13.setBackgroundColor(selectedColor);
                linearLayout14.setBackgroundColor(selectedColor);
            }

            });

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout12.setBackgroundColor(Color.RED);
                linearLayout11.setBackgroundColor(selectedColor);
                linearLayout13.setBackgroundColor(selectedColor);
                linearLayout14.setBackgroundColor(selectedColor);
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout13.setBackgroundColor(Color.BLUE);
                linearLayout12.setBackgroundColor(selectedColor);
                linearLayout11.setBackgroundColor(selectedColor);
                linearLayout14.setBackgroundColor(selectedColor);
            }
        });

        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout14.setBackgroundColor(Color.YELLOW);
                linearLayout12.setBackgroundColor(selectedColor);
                linearLayout13.setBackgroundColor(selectedColor);
                linearLayout11.setBackgroundColor(selectedColor);
            }
        });

    }
}