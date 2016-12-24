package com.example.apple.kotlin_sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androidhuman.example.hellokotlin.HelloKt;

import AddModule_package.Sample;
import Sample_2.Sample_2Kt;


public class MainActivity extends AppCompatActivity {
    private static final String KEY_TRANS_1 = "TRANS_1";
    private static final String KEY_TRANS_2 = "TRANS_2";

    TextView sample_text;
    TextView sample_text_2;
    TextView sample_text_3;
    TextView sample_text_4;
    TextView sample_text_5;
    TextView sample_text_6;
    TextView sample_text_7;

    Button toast_sample_button;

    //더하기 결과(코들린 처리)//
    int result_value;

    //코틀린 클래스 선언//
    Customer_package.Customer customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        sample_text = (TextView)findViewById(R.id.sample_textview);
        sample_text_2 = (TextView)findViewById(R.id.result_value);
        sample_text_3 = (TextView)findViewById(R.id.result_2_value);
        sample_text_4 = (TextView)findViewById(R.id.lambda_sample);
        sample_text_5 = (TextView)findViewById(R.id.condition_text);
        sample_text_6 = (TextView)findViewById(R.id.forsamplesum);
        sample_text_7 = (TextView)findViewById(R.id.class_gettext);
        toast_sample_button = (Button)findViewById(R.id.sample_toast);

        /** Kotlin Test **/
        sample_text.setText(HelloKt.formatMessage("Kotlin")); //코틀린으로 출력//
        result_value = Sample.add_value(10,20);
        sample_text_2.setText(""+result_value);
        sample_text_3.setText(Sample.get_result_print());
        Sample.print_message();
        sample_text_4.setText(Sample.get_return(1,10));
        Sample.compare_func(10);
        Sample_2Kt.print_str();
        sample_text_5.setText(Sample.condition_check("chang!!"));
        Sample.condition_check_2("Hello");
        sample_text_6.setText(""+Sample.loop_sample(10,20,30));

        //코틀린 클래스 정의//
        customer = new Customer_package.Customer("seochangwook", "010-42084757");
        String get_customer_info = customer.print_customer();

        sample_text_7.setText(get_customer_info);

        toast_sample_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customer.toast(MainActivity.this, "sample toast",0);

                String trans_data_1 = "seo";
                String trans_data_2 = "1";

                Intent intent = new Intent(MainActivity.this, MainActivity_kotlin.class);

                intent.putExtra(KEY_TRANS_1, trans_data_1);
                intent.putExtra(KEY_TRANS_2, trans_data_2);

                startActivity(intent);
            }
        });

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
