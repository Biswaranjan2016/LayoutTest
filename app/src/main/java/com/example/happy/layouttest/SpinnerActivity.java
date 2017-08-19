package com.example.happy.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);
    }

    protected void onResume(){
        super.onResume();
        Spinner spinner = (Spinner) findViewById(R.id.planet_spinner);
        //Create an ArrayAdapter using the string array and default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array,
                android.R.layout.simple_spinner_item);

        //Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Apply the adapter to spinner
        spinner.setAdapter(adapter);

        //Apply Listener to the spinner
        spinner.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View view,int pos,long id){
        String obj = (String)parent.getItemAtPosition(pos);
        TextView textView = (TextView)findViewById(R.id.txtSpinner);
        textView.setText(obj);
    }
    public void onNothingSelected(AdapterView<?> parent){

    }

}
