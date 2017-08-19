package com.example.happy.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);
    }

    protected void onResume(){
        super.onResume();

    }
    public void preferedCountry(View view){
        int idOfRadioB = ((RadioButton) view).getId();
        boolean isChecked = ((RadioButton) view).isChecked();
        TextView textView = (TextView) findViewById(R.id.countryRbBox);
        switch (idOfRadioB){
            case R.id.rbIndia:
                if (isChecked){
                    textView.setText("India");
                }
                break;
            case R.id.rbRsa:
                if (isChecked){
                    textView.setText("Russia");
                }
                break;
            case R.id.rbUs:
                if (isChecked){
                    textView.setText("United States");
                }
                break;
            case R.id.rbEu:
                if (isChecked){
                    textView.setText("Europe");
                }
                break;

        }
    }
}
