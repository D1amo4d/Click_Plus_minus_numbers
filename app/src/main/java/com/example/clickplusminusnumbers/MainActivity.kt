package com.example.clickplusminusnumbers

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var agePlusMinus: Int = 1
    var tvNumder: TextView = findViewById(R.id.tv_number)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMinus: Button = findViewById(R.id.btn_minus)
        var btnPlus: Button = findViewById(R.id.btn_plus)

        btnPlus.setOnClickListener {
            ageInciriment()
            agePlusMinus++
            
        }

        btnMinus.setOnClickListener {
            ageInciriment()
            agePlusMinus--
        }


    }

    private fun ageInciriment() {
        tvNumder.text = agePlusMinus.toString()


    }
}