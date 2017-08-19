package com.example.happy.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.togglebutton);
    }

    protected void onResume(){
        super.onResume();
        ToggleButton tgButton = (ToggleButton) findViewById(R.id.tgButton);
        tgButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton compoundButton,boolean isChecked){
                if (isChecked){
                    System.out.println("Checked");
                }else{
                    System.out.println("Not Checked");
                }
            }
        });
    }
}
