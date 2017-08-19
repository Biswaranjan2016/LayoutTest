package com.example.happy.layouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
//        int count = 0;

    }
//    public void onResume(){
//        super.onResume();
//
//        Button button = (Button) findViewById(R.id.listenerBtn);
//        final TextView textView = (TextView) findViewById(R.id.txt);
//        button.setOnClickListener(new View.OnClickListener(){
//        public void onClick(View v){
//            textView.setText("This response is dynamic");
//            }
//
//        });
//
//
//
//    }
    public void sendMessage(View view){
        TextView textView = (TextView) findViewById(R.id.txt);
        textView.setText("Now very close to my goal");
    }

    public void clearMessage(View view){
        TextView textView = (TextView) findViewById(R.id.txt);
        textView.setText(" ");
    }

    public void checkboxActivity(View view){
        Intent intent = new Intent(this,CheckBoxActivity.class);
        startActivity(intent);
    }
    public void radioButtonActivity(View view){
        Intent intent = new Intent(this,RadioButtonActivity.class);
        startActivity(intent);
    }
    public void toggleButtonActivity(View view){
        Intent intent = new Intent(this,ToggleButtonActivity.class);
        startActivity(intent);
    }
    public void spinnerActivity(View view){
        Intent intent = new Intent(this,SpinnerActivity.class);
        startActivity(intent);
    }

    public void fragmentActivity(View view){
        Intent intent = new Intent(this,RssFeedActivity.class);
        startActivity(intent);
    }
}
