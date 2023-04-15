package com.suraj.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {



    private lateinit var c1 : RadioButton
    private lateinit var b2 : RadioButton
    private lateinit var b3 : RadioButton
    private lateinit var c4 : RadioButton
    private lateinit var d5 : RadioButton

    private lateinit var btnSubmit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        setOnClick()



    }

    private fun initView () {
        c1 = findViewById(R.id.c1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        c4 = findViewById(R.id.c4)
        d5 = findViewById(R.id.d5)
        btnSubmit = findViewById(R.id.btnSubmit)
    }

    private fun setOnClick(){

        btnSubmit.setOnClickListener {
            var score  = 0

            if (c1.isChecked)score++

            if (b2.isChecked)score++

            if (b3.isChecked)score++

            if (c4.isChecked)score++

            if (d5.isChecked)score++

            btnSubmit.setText(score.toString())


        }

    }


}