package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main6.*

class Main6Activity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        if (cgpa_new<8.0){
            bu23.visibility=View.INVISIBLE
            bu1.visibility=View.INVISIBLE
            if(cgpa_new<7.5){
                bu27.visibility=View.INVISIBLE
                bu4.visibility=View.INVISIBLE
                if(cgpa_new<5.5){
                    bu21.visibility=View.INVISIBLE
                    bu43.visibility=View.INVISIBLE
                    bu2.visibility=View.INVISIBLE
                    bu3.visibility=View.INVISIBLE
                }
            }
        }
    }

    fun cal(view: View){
        var cd= view as Button
        var cgpa=0.0

        when(cd.id){

            bu1.id->{ var intent=Intent(this@Main6Activity,Main2Activity::class.java)
                startActivity(intent)}
            bu4.id->{ var intent= Intent(this@Main6Activity,Main3Activity::class.java)
                startActivity(intent)}
            bu2.id->{ var intent= Intent(this@Main6Activity,Main4Activity::class.java)
                startActivity(intent)}
            bu3.id->{ var intent= Intent(this@Main6Activity,Main5Activity::class.java)
                startActivity(intent)}

        }
    }
}
