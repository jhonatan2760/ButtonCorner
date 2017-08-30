package com.example.logonrm.buttoncontroller;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private SeekBar s;
    private Button btn;
    private Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.s = (SeekBar) findViewById(R.id.sBar);
        this.s.setMax(30);
        this.btn = (Button) findViewById(R.id.btn);
        this.spn = (Spinner) findViewById(R.id.spinner);
        setListeners();
    }


    private void onChange(int progress){
        GradientDrawable d = new GradientDrawable();
        d.setCornerRadius(progress);
        d.setColor(Color.parseColor("#FFFF8800"));
        btn.setBackground(d);
    }

    private void setListeners(){
        this.s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                onChange(seekBar.getProgress());
            }
        });
    }
}
