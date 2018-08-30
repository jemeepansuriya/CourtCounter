package com.example.jemee.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threeplus(View view)
    {
        displaya(3);
    }
    public void twoplus(View view)
    {
        displaya(2);
    }
    public void oneplus(View view)
    {
        displaya(1);
    }
    public void bthreeplus(View view)
    {
        displayb(3);
    }
    public void btwoplus(View view)
    {
        displayb(2);
    }
    public void boneplus(View view)
    {
        displayb(1);
    }
    public   void reset(View view)
    {
        displaya(-1);
        displayb(-1);
    }
    public void displaya(int a)
    {
        TextView t1=(TextView)findViewById(R.id.textView2);
        int k=Integer.parseInt(t1.getText().toString());
        k=k+a;
        if(a == -1)
        {
            k=0;
        }
        t1.setText(Integer.toString(k));
    }
    public void displayb(int a)
    {
        TextView t1=(TextView)findViewById(R.id.textView4);
        int k=Integer.parseInt(t1.getText().toString());
        k=k+a;
        if(a == -1)
        {
            k=0;
        }
        t1.setText(Integer.toString(k));
    }
}
