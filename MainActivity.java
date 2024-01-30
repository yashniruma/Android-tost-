package com.example.toast_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button bt = (Button)findViewById(R.id.button);

       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String text ="Riltev thi chandu & Riyal thi shudhatma";
//               Toast.makeText(text,Toast.LENGTH_SHORT).show();
               Toast.makeText(MainActivity.this,"Hello Shilwan Mushafir", Toast.LENGTH_LONG).show();
           }
       });


    }
}