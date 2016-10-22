package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Act4 extends AppCompatActivity {
    public Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        btn4 = (Button) findViewById(R.id.button4);
        btn4.setText("布局xml定义");
    }
    public void myOnclick(View v){
        Toast.makeText(Act4.this, "布局xml定义", Toast.LENGTH_SHORT).show();
    }
}
