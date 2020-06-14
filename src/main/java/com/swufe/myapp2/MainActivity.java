package com.swufe.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv=(TextView)findViewById(R.id.showText);

        EditText inp = (EditText)findViewById(R.id.editText2);
        String str=inp.getText().toString();

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            Log.i("click","onClick ......");
        TextView tv=(TextView)findViewById(R.id.showText);

        EditText inp = (EditText)findViewById(R.id.editText2);
        String str=inp.getText().toString();

        double i = Integer.parseInt(str);
        double t = i*1.8+32;

        tv.setText("等于" +t+"华氏度");
    }
}
