package com.developersbd.cgpacalculator.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity implements View.OnTouchListener{
    private TextView sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8;
    private EditText marks1,marks2,marks3,marks4,marks5,marks6,marks7,marks8;
    private EditText credit_hour1,credit_hour2,credit_hour3,credit_hour4,credit_hour5,credit_hour6,credit_hour7,credit_hour8;
    private Button button_calculation;
    private int range=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //range is the number of how many subject user has. default number is 4
        try {
            String range_string = getIntent().getStringExtra("range");
            range=Integer.parseInt(range_string);
        }catch (Exception e)
        {
            Log.d("range","subject range seleceted default. ");
        }

        //initiallinging text views
        sub1=(TextView) findViewById(R.id.textView);
        sub2=(TextView) findViewById(R.id.textView2);
        sub3=(TextView) findViewById(R.id.textView3);
        sub4=(TextView) findViewById(R.id.textView4);
        sub5=(TextView) findViewById(R.id.textView5);
        sub6=(TextView) findViewById(R.id.textView6);
        sub7=(TextView) findViewById(R.id.textView7);
        sub8=(TextView) findViewById(R.id.textView8);



        //initialliging marks input edit texts
        marks1=(EditText) findViewById(R.id.editText);
        marks2=(EditText) findViewById(R.id.editText3);
        marks3=(EditText) findViewById(R.id.editText5);
        marks4=(EditText) findViewById(R.id.editText7);
        marks5=(EditText) findViewById(R.id.editText9);
        marks6=(EditText) findViewById(R.id.editText11);
        marks7=(EditText) findViewById(R.id.editText13);
        marks8=(EditText) findViewById(R.id.editText15);

        //initialliging credit hour edit texts
        credit_hour1=(EditText) findViewById(R.id.editText2);
        credit_hour2=(EditText) findViewById(R.id.editText4);
        credit_hour3=(EditText) findViewById(R.id.editText6);
        credit_hour4=(EditText) findViewById(R.id.editText8);
        credit_hour5=(EditText) findViewById(R.id.editText10);
        credit_hour6=(EditText) findViewById(R.id.editText12);
        credit_hour7=(EditText) findViewById(R.id.editText14);
        credit_hour8=(EditText) findViewById(R.id.editText16);

        //initialliging calculation button
        button_calculation=(Button) findViewById(R.id.button2);

        button_calculation.setOnTouchListener(this);

        //set visibility of the subjects

        if(range==2)
        {
            sub3.setVisibility(View.GONE);
            sub4.setVisibility(View.GONE);
            sub5.setVisibility(View.GONE);
            sub6.setVisibility(View.GONE);
            sub7.setVisibility(View.GONE);
            sub8.setVisibility(View.GONE);

            marks3.setVisibility(View.GONE);
            marks4.setVisibility(View.GONE);
            marks5.setVisibility(View.GONE);
            marks6.setVisibility(View.GONE);
            marks7.setVisibility(View.GONE);
            marks8.setVisibility(View.GONE);

            credit_hour3.setVisibility(View.GONE);
            credit_hour4.setVisibility(View.GONE);
            credit_hour5.setVisibility(View.GONE);
            credit_hour6.setVisibility(View.GONE);
            credit_hour7.setVisibility(View.GONE);
            credit_hour8.setVisibility(View.GONE);




        }
        else if(range==3)
        {

            sub4.setVisibility(View.GONE);
            sub5.setVisibility(View.GONE);
            sub6.setVisibility(View.GONE);
            sub7.setVisibility(View.GONE);
            sub8.setVisibility(View.GONE);


            marks4.setVisibility(View.GONE);
            marks5.setVisibility(View.GONE);
            marks6.setVisibility(View.GONE);
            marks7.setVisibility(View.GONE);
            marks8.setVisibility(View.GONE);


            credit_hour4.setVisibility(View.GONE);
            credit_hour5.setVisibility(View.GONE);
            credit_hour6.setVisibility(View.GONE);
            credit_hour7.setVisibility(View.GONE);
            credit_hour8.setVisibility(View.GONE);
        }
        else if(range==4)
        {

            sub5.setVisibility(View.GONE);
            sub6.setVisibility(View.GONE);
            sub7.setVisibility(View.GONE);
            sub8.setVisibility(View.GONE);


            marks5.setVisibility(View.GONE);
            marks6.setVisibility(View.GONE);
            marks7.setVisibility(View.GONE);
            marks8.setVisibility(View.GONE);


            credit_hour5.setVisibility(View.GONE);
            credit_hour6.setVisibility(View.GONE);
            credit_hour7.setVisibility(View.GONE);
            credit_hour8.setVisibility(View.GONE);
        }
        else if(range==5)
        {

            sub6.setVisibility(View.GONE);
            sub7.setVisibility(View.GONE);
            sub8.setVisibility(View.GONE);


            marks6.setVisibility(View.GONE);
            marks7.setVisibility(View.GONE);
            marks8.setVisibility(View.GONE);


            credit_hour6.setVisibility(View.GONE);
            credit_hour7.setVisibility(View.GONE);
            credit_hour8.setVisibility(View.GONE);
        }
        else if(range==6)
        {

            sub7.setVisibility(View.GONE);
            sub8.setVisibility(View.GONE);



            marks7.setVisibility(View.GONE);
            marks8.setVisibility(View.GONE);



            credit_hour7.setVisibility(View.GONE);
            credit_hour8.setVisibility(View.GONE);
        }
        else if(range==7)
        {

            sub8.setVisibility(View.GONE);



            marks8.setVisibility(View.GONE);



            credit_hour8.setVisibility(View.GONE);
        }
        else if(range==8)
        {

        }


    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        switch (motionEvent.getAction())
        {

            case MotionEvent.ACTION_DOWN: button_calculation.setAlpha(0.5f);
                                          break;
            case MotionEvent.ACTION_UP: button_calculation.setAlpha(1);
                float x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,y1,y2,y3,y4,y5,y6,y7,y8;

                //reading subject's numbers
                x1=Float.parseFloat(marks1.getText().toString());
                x2=Float.parseFloat(marks2.getText().toString());
                x3=Float.parseFloat(marks3.getText().toString());
                x4=Float.parseFloat(marks4.getText().toString());
                x5=Float.parseFloat(marks4.getText().toString());
                x6=Float.parseFloat(marks4.getText().toString());
                x7=Float.parseFloat(marks4.getText().toString());
                x8=Float.parseFloat(marks4.getText().toString());

                //reading credit hour
                y1=Float.parseFloat(credit_hour1.getText().toString());
                y2=Float.parseFloat(credit_hour2.getText().toString());
                y3=Float.parseFloat(credit_hour3.getText().toString());
                y4=Float.parseFloat(credit_hour4.getText().toString());
                y5=Float.parseFloat(credit_hour4.getText().toString());
                y6=Float.parseFloat(credit_hour4.getText().toString());
                y7=Float.parseFloat(credit_hour4.getText().toString());
                y8=Float.parseFloat(credit_hour4.getText().toString());


                //calculation and generating result
                float res=((x1*y1)+(x2*y2)+(x3*y3)+(x4*y4)+(x5*y5)+(x6*y6)+(x7*y7)+(x8*y8))/(y1+y2+y3+y4+y5+y6+y7+y8);
                Toast.makeText(getBaseContext(),"CGPA: "+res,Toast.LENGTH_LONG).show();
                                        break;
            case MotionEvent.ACTION_MOVE: break;

        }
        return false;
    }
}
