package com.j4android.bug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_click;
    TextView tv_player;
    int player = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_click = (Button)findViewById(R.id.btn_click);
        tv_player = (TextView)findViewById(R.id.ns_player);



        btn_click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                player = Integer.parseInt(tv_player.getText().toString());
                Intent intent = new Intent(MainActivity.this,PrintBug.class);
                intent.putExtra("player",tv_player.getText().toString());
                startActivity(intent);

            }
        });
    }
}