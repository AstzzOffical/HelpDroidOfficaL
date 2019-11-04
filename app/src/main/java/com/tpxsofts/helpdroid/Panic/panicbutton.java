package com.tpxsofts.helpdroid.Panic;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tpxsofts.helpdroid.R;

public class panicbutton extends AppCompatActivity implements View.OnClickListener {
    TextView pushtxt;
    ImageView btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panicbutton);
        pushtxt=findViewById(R.id.pushtxt);
        btn=findViewById(R.id.pushbutton);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        btn.setImageResource(R.drawable.grnbutton);
        pushtxt.setVisibility(View.INVISIBLE);

    }
}
