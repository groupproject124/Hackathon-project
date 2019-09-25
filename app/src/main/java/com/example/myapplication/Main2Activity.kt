package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.nj.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nj)
    }
    fun see(view: View){
        var cd= view as Button
        when(cd.id){

            hh2.id->{ var intent= Intent(applicationContext,Main6Activity::class.java)
                startActivity(intent)}
        }
    }
}
