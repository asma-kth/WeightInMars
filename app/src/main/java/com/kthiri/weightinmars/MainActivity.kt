package com.kthiri.weightinmars

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

var weight = editText.text
        var w = weight.toString().toDouble()
            buttonweight.setOnClickListener {

            var result = w*0.38

            textresult.text=result.toString()
        }

    }

}
