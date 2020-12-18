package com.example.androidstudyjam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.androidstudyjam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
      //  binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.imageButton2.setOnClickListener{
            addName(it)
        }
    }
    private fun addName(view: View)
    {
        binding.apply {
            showText .text = "Hello " + name.text.toString() + "! It's great to finally meet you."
            showText .visibility = View.VISIBLE

        }

    }
}