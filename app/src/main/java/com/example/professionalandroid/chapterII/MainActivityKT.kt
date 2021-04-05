package com.example.professionalandroid.chapterII

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.professionalandroid.R

import com.example.professionalandroid.R.id

class MainActivityKT :AppCompatActivity() {

    lateinit var  tv_hello : TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        loadprogrammatically()

    }

    private fun loadprogrammatically() {



    }

    private fun initViews(){
        tv_hello = findViewById(R.id.tv_hello) ;
        tv_hello.text = " Mucho Gracias"

    }
}
