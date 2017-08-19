package com.example.happy.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity {
    static int count = 0;
    static boolean box1 = true,box2 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);
    }
    public void onResume(){
        super.onResume();


    }

    public void countClick(View view){
//        CheckBox checkBox = (CheckBox) findViewById(R.id.chkBox1);
//        CheckBox checkBox2 = (CheckBox) findViewById(R.id.chkBox2);
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.chkBox1:
                if (CheckBoxActivity.box1){
                    CheckBoxActivity.count++;
                    CheckBoxActivity.box1 = false;
                }else {
                    CheckBoxActivity.count--;
                    CheckBoxActivity.box1 = true;
                }
                break;
            case R.id.chkBox2:
                if (CheckBoxActivity.box2){
                    CheckBoxActivity.count++;
                    CheckBoxActivity.box2 = false;
                }else {
                    CheckBoxActivity.count--;
                    CheckBoxActivity.box2 = true;
                }
                break;

        }


        TextView textView = (TextView) findViewById(R.id.textCheck);
        textView.setText(Integer.toString(CheckBoxActivity.count)+" item(s) Selected");
    }


}
