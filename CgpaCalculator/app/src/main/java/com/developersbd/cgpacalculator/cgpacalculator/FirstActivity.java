package com.developersbd.cgpacalculator.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity implements View.OnTouchListener{
    private TextView sub1,sub2,sub3,sub4;
    private EditText marks1,marks2,marks3,marks4;
    private EditText credit_hour1,credit_hour2,credit_hour3,credit_hour4;
    private Button button_calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //initiallinging text views
        sub1=(TextView) findViewById(R.id.textView);
        sub2=(TextView) findViewById(R.id.textView2);
        sub3=(TextView) findViewById(R.id.textView3);
        sub4=(TextView) findViewById(R.id.textView4);

        //initialliging marks input edit texts
        marks1=(EditText) findViewById(R.id.editText);
        marks2=(EditText) findViewById(R.id.editText2);
        marks3=(EditText) findViewById(R.id.editText3);
        marks4=(EditText) findViewById(R.id.editText4);

        //initialliging credit hour edit texts
        credit_hour1=(EditText) findViewById(R.id.editText4);
        credit_hour2=(EditText) findViewById(R.id.editText4);
        credit_hour3=(EditText) findViewById(R.id.editText4);
        credit_hour4=(EditText) findViewById(R.id.editText4);

        //initialliging calculation button
        button_calculation=(Button) findViewById(R.id.button2);

        button_calculation.setOnTouchListener(this);




    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        switch (motionEvent.getAction())
        {

            case MotionEvent.ACTION_DOWN: button_calculation.setAlpha(0.5f);
                                          break;
            case MotionEvent.ACTION_UP: button_calculation.setAlpha(1);
                float x1,x2,x3,x4,y1,y2,y3,y4;

                //reading subject's numbers
                x1=Float.parseFloat(marks1.getText().toString());
                x2=Float.parseFloat(marks2.getText().toString());
                x3=Float.parseFloat(marks3.getText().toString());
                x4=Float.parseFloat(marks4.getText().toString());

                //reading credit hour
                y1=Float.parseFloat(credit_hour1.getText().toString());
                y2=Float.parseFloat(credit_hour2.getText().toString());
                y3=Float.parseFloat(credit_hour3.getText().toString());
                y4=Float.parseFloat(credit_hour4.getText().toString());

                //calculation and generating result
                float res=((x1*y1)+(x2*y2)+(x3*y3)+(x4*y4))/(y1+y2+y3+y4);
                Toast.makeText(getBaseContext(),"CGPA: "+res,Toast.LENGTH_LONG).show();
                                        break;
            case MotionEvent.ACTION_MOVE: break;

        }
        return false;
    }
}
