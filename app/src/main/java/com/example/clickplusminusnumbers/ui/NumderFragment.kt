package com.example.clickplusminusnumbers.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.clickplusminusnumbers.MainActivity.Companion.TV_NUMBER_KEY
import com.example.clickplusminusnumbers.R

class NumderFragment : Fragment() {
    lateinit var tvNumbers: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_numder, container, false)
        val tvNum = tvNumbers.findViewById<TextView>(R.id.tv_number)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        val getTvNumber = bundle.getString(TV_NUMBER_KEY)
        tvNumbers.text = getTvNumber
    }
}