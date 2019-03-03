package com.example.mrhridoy.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText taka;
    Button b;
    TextView saudi_riyal;
    TextView us_dollar;
    TextView uk_pound;
    TextView spain_euro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taka=(EditText)findViewById(R.id.edit_text);
        b=(Button)findViewById(R.id.convert);
        saudi_riyal=(TextView)findViewById(R.id.textview_riyal);
        us_dollar=(TextView) findViewById(R.id.textview_dollar);
        uk_pound=(TextView)findViewById(R.id.textview_pound);
        spain_euro=(TextView)findViewById(R.id.textview_euro);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(taka.getText().toString().isEmpty()) {

                        Toast.makeText(getApplicationContext(),"No Value Insert You",Toast.LENGTH_LONG).show();
                    }
                    else {

                        Double tkamount_r = Double.parseDouble(taka.getText().toString());
                        Double riyal = tkamount_r * 0.045;
                        String r = String.format("%.4f", riyal);
                        saudi_riyal.setText("Saudi Riyal=" + Double.valueOf(r).toString());
                        //riyal convert

                        Double tkamount_d = Double.parseDouble(taka.getText().toString());
                        Double dollar = tkamount_d * 0.012;
                        String d = String.format("%.4f", dollar);
                        us_dollar.setText("American Dollar=" + Double.valueOf(d).toString());
                        //dollar convert

                        Double tkamount_p = Double.parseDouble(taka.getText().toString());
                        Double pound = tkamount_p * 0.0090;
                        String p = String.format("%.4f", pound);
                        uk_pound.setText("British Pound=" + Double.valueOf(p).toString());
                        //pound convert

                        Double tkamount_e = Double.parseDouble(taka.getText().toString());
                        Double euro = tkamount_e * 0.010;
                        String e = String.format("%.4f", euro);
                        spain_euro.setText("Euro=" + Double.valueOf(e).toString());
                        //euro convert

                    }



            }
        });

    }
}