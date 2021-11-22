package com.example.maincicles;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_oncreate_count;
    TextView tv_onstart_count;
    TextView tv_onrestart_count;
    TextView tv_onresume_count;
    TextView tv_onpause_count;
    TextView tv_onstop_count;
    TextView tv_ondestroy_count;

    int contCreate, contStart, contRestart, contResume, contPause, contStop,contDestroy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_oncreate_count=(TextView)findViewById(R.id.tv_oncreate_count);
        tv_onstart_count=(TextView)findViewById(R.id.tv_onstart_count);
        tv_onrestart_count=(TextView)findViewById(R.id.tv_onrestart_count);
        tv_onresume_count=(TextView)findViewById(R.id.tv_onresume_count);
        tv_onpause_count=(TextView)findViewById(R.id.tv_onpause_count);
        tv_onstop_count=(TextView)findViewById(R.id.tv_onstop_count);
        tv_ondestroy_count=(TextView)findViewById(R.id.tv_ondestroy_count);

        contCreate=0;
        contStart=0;
        contRestart=0;
        contResume=0;
        contPause=0;
        contStop=0;
        contDestroy=0;


        Toast.makeText(getApplicationContext(),"OnCreate", Toast.LENGTH_SHORT).show();
        contCreate+=1;
        tv_oncreate_count.setText(String.valueOf(contCreate));
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"OnStart", Toast.LENGTH_SHORT).show();
        contStart+=1;
        tv_onstart_count.setText(String.valueOf(contStart));
    }

    @Override
    protected void onRestart(){
        contRestart=0;
        super.onRestart();
        Toast.makeText(getApplicationContext(),"OnRestart", Toast.LENGTH_SHORT).show();
        contRestart+=1;
        tv_onrestart_count.setText(String.valueOf(contRestart));
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),"OnResume", Toast.LENGTH_SHORT).show();
        contResume+=1;
        tv_onresume_count.setText(String.valueOf(contResume));
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"OnPause", Toast.LENGTH_SHORT).show();
        contPause +=1;
        tv_onpause_count.setText(String.valueOf(contPause));
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"OnStop", Toast.LENGTH_SHORT).show();
        contStop+=1;
        tv_onstop_count.setText(String.valueOf(contStop));
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"OnDestroy", Toast.LENGTH_SHORT).show();
        contDestroy+=1;
        tv_ondestroy_count.setText(String.valueOf(contDestroy));
    }
}