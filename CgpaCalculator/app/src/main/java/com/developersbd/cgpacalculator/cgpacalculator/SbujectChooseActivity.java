package com.developersbd.cgpacalculator.cgpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SbujectChooseActivity extends AppCompatActivity implements View.OnTouchListener{
    private TextView warning;
    private EditText input_range;
    private Button btn_ok;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbuject_choose);

        //initialliging materials
        warning=(TextView) findViewById(R.id.textView9);
        input_range=(EditText) findViewById(R.id.editText17);
        btn_ok=(Button) findViewById(R.id.button);
        checkBox=(CheckBox) findViewById(R.id.checkBox);

        btn_ok.setOnTouchListener(this);
        warning.setVisibility(View.INVISIBLE);

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction())
        {
            case MotionEvent.ACTION_DOWN:btn_ok.setAlpha(0.5f);
                                         break;

            case MotionEvent.ACTION_UP: btn_ok.setAlpha(1);
                try{
                    String input=input_range.getText().toString();
                    int range=0;

                    range=Integer.parseInt(input);
                    Log.d("range","Exception: "+range);
                    if(range>=2 && range<=8){
                        warning.setVisibility(View.INVISIBLE);
                        Intent intent=new Intent(SbujectChooseActivity.this,FirstActivity.class);
                        intent.putExtra("range",input);
                        startActivity(intent);

                    }

                    else
                    {
                        warning.setVisibility(View.VISIBLE);
                    }
                }catch (Exception e)
                {
                    Log.d("range","Exception: "+e);
                }
                break;

            case MotionEvent.ACTION_MOVE:break;
        }
        return false;
    }
}
