package com.harishrathor.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        Thread mythread = new Thread() {
            @Override
            public  void  run(){
                try {
                    sleep(3000);
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }; mythread.start();
    }
}
