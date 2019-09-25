package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main6.*

class Main6Activity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
    }
    fun cal(view: View){
        var cd= view as ImageButton
        var cgpa=0.0

        when(cd.id){

            bu1.id->{ var intent= Intent(applicationContext,Main2Activity::class.java)
                startActivity(intent)}
            bu2.id->{ var intent= Intent(applicationContext,Main3Activity::class.java)
                startActivity(intent)}
            bu3.id->{ var intent= Intent(applicationContext,Main4Activity::class.java)
                startActivity(intent)}
            bu4.id->{ var intent= Intent(applicationContext,Main5Activity::class.java)
                startActivity(intent)}

        }
    }
}
