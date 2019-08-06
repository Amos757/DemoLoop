package com.example.demoloop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            var i = 1

            //For Loop
//            for (i in 1..5) {
//                Log.d("MainActivity" , "$i")
//            }

            //While loop
            while (i < 6) {
                Log.d("MainActivity" , "$i")
                i++
            }
        }

        btn2.setOnClickListener {
            val word = editText.text.toString()

            for(letter in word) {
                Log.d("MainActivity" , "$letter")
            }

        }



    }
}
