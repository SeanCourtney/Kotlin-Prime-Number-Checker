package com.cre8.primenumbercheckerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBtn.setOnClickListener {
            val num = enterNumber.text.toString().toInt()
            var flag = false

            for (i in 2..num / 2) {
                if (num % i == 0) {
                    flag = true
                    break
                }
            }

            if (!flag)
                resultText.text = "Prime"
            else
                resultText.text = "Not Prime"
        }
    }
}

