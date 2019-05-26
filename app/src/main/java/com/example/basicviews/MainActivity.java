package com.example.basicviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declare variable
    // syntax type variable
    Button mToastBtn,mCountUpBtn,mCountDownBtn;
    TextView mDisplayCount;
    //strings array
    String[] mgreetings={"Handsome","Beautiful","Awesome","Smart","Cheerful","Lovely","Clever"};
    int indexPas=0;
    int mcount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign variables to there respective views
        mToastBtn=findViewById(R.id.btnToast);
        mCountUpBtn=findViewById(R.id.btncountup);
        mCountDownBtn=findViewById(R.id.btncountdown);
        mDisplayCount=findViewById(R.id.txtDisplayCount);


        //set onclick listener on button
        //programatically
        mToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic happens when button is clicked
                Toast.makeText(MainActivity.this, "Hey There"+mgreetings[indexPas], Toast.LENGTH_SHORT).show();
                if (indexPas<mgreetings.length){
                    indexPas++;
                }
            }
        });

    }
    public void countUp(View view){
        mcount++;
        mDisplayCount.setText(" "+mcount);
    }


    public void countDown(View view) {
        mcount--;
        mDisplayCount.setText(" "+mcount);
    }
}
