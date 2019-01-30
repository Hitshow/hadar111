package com.example.a.hadar111;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class hadar111 extends AppCompatActivity {
    ToggleButton tb ;
    Switch swDN;
    LinearLayout ll ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadar111);
        tb = (ToggleButton) findViewById(R.id.tb);
        swDN = (Switch) findViewById(R.id.swDN);
        ll = (LinearLayout)findViewById(R.id.ll);
    }

    public void check(View view) {
        if ((tb.isChecked())&&(swDN.isChecked()))
            ll.setBackgroundColor(Color.rgb(139,0,139));
        else if((tb.isChecked()))
            ll.setBackgroundColor(Color.RED);
        else if (swDN.isChecked())
        ll.setBackgroundColor(Color.BLUE);
        else
            ll.setBackgroundColor(Color.WHITE);

    }
}