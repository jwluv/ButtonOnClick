package com.lyna.www.buttononclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {

        String str = "You clicked ";

        int id = view.getId();

        switch(id) {
            case R.id.button1:
                str+="button1";
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                str+="button2";
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                str+="button3";
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
                break;


        }


    }
}
