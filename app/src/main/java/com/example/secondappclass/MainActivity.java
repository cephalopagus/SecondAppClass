package com.example.secondappclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        findViewById(R.id.cr_v).setBackgroundResource(R.drawable.bg_card);

        findViewById(R.id.materialButton).setOnClickListener(v -> {
            if (findViewById(R.id.cr_v).getVisibility() == View.VISIBLE){
                findViewById(R.id.cr_v).setVisibility(View.GONE);
            }else {
                findViewById(R.id.cr_v).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, findViewById(R.id.editText).toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}