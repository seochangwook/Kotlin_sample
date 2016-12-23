package com.example.apple.kotlin_sample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.androidhuman.example.hellokotlin.HelloKt;
import AddModule_package.SampleKt;
import Sample_2.Sample_2Kt;

public class MainActivity extends AppCompatActivity {
    TextView sample_text;
    TextView sample_text_2;
    TextView sample_text_3;
    TextView sample_text_4;

    //더하기 결과(코들린 처리)//
    int result_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        sample_text = (TextView)findViewById(R.id.sample_textview);
        sample_text_2 = (TextView)findViewById(R.id.result_value);
        sample_text_3 = (TextView)findViewById(R.id.result_2_value);
        sample_text_4 = (TextView)findViewById(R.id.lambda_sample);

        /** Kotlin Test **/
        sample_text.setText(HelloKt.formatMessage("Kotlin")); //코틀린으로 출력//
        result_value = SampleKt.add_value(10,20);
        sample_text_2.setText(""+result_value);
        sample_text_3.setText(SampleKt.get_result_print());
        SampleKt.print_message();
        sample_text_4.setText(SampleKt.get_return(1,10));
        SampleKt.compare_func(10);
        Sample_2Kt.print_str();
        

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
