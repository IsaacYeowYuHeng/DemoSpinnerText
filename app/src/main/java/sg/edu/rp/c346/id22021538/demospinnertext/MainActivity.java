package sg.edu.rp.c346.id22021538.demospinnertext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spnYesNo;
    TextView tvSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSpinner = findViewById(R.id. tvSpin);
        spnYesNo = findViewById(R.id. spinner);

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                    tvSpinner.setText("Spinner Item, Yes selected");
                        break;
                    case 1:
                    tvSpinner.setText("Spinner Item, No selected");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}