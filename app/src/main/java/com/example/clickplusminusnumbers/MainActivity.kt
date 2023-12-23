package com.example.clickplusminusnumbers

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.clickplusminusnumbers.ui.NumderFragment

class MainActivity : AppCompatActivity() {
    var agePlusMinus: Int = 1
    lateinit var tvNumber: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMinus: Button = findViewById(R.id.btn_minus)
        var btnPlus: Button = findViewById(R.id.btn_plus)
        tvNumber = findViewById(R.id.tv_number)

        btnPlus.setOnClickListener {
            val age = tvNumber.text.toString().toIntOrNull() ?: 0
            ageInciriment()
            agePlusMinus++
            if (age == 20) {

                val bundle = Bundle()
                bundle.putString(TV_NUMBER_KEY, age.toString())
                val numbetFragment = NumderFragment()
                numbetFragment.arguments = bundle
                val intent = Intent(this, numbetFragment::class.java)
                startActivity(intent)
            } else {

            }
        }

        btnMinus.setOnClickListener {
            ageInciriment()
            agePlusMinus--
        }


    }

    private fun ageInciriment() {
        tvNumber.text = agePlusMinus.toString()


    }

    companion object {
        const val TV_NUMBER_KEY = "tv.number.key"
    }
}