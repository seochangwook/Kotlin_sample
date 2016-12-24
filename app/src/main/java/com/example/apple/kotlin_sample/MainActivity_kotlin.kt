package com.example.apple.kotlin_sample

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.TextView

class MainActivity_kotlin : AppCompatActivity() {
    private val KEY_TRANS_1 = "TRANS_1"
    private val KEY_TRANS_2 = "TRANS_2"

    var trans_data_1:String = ""
    var trans_data_2:Int = 0
    var view_text:String = ""

    //사용할 위젯//
    var view_textview: TextView? = null //Null에 안전하도록 설정//

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity_kotlin)

        view_textview = findViewById(R.id.sample_text) as TextView?

        //값을 가져온다.(코틀린에서 객체 생성은 변수로 값을 받아야 한다.)//
        var intent = Intent()

        intent = getIntent()

        trans_data_1 = intent.getStringExtra(KEY_TRANS_1) //만약 널값이라도 안전//
        trans_data_2 = Integer.parseInt(intent.getStringExtra(KEY_TRANS_2))

        view_text = trans_data_1 + "/" + ""+trans_data_2

        view_textview?.setText(view_text)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show() }
    }

}
