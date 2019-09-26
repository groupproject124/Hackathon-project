package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.bu2
import kotlinx.android.synthetic.main.activity_main5.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    public fun sendEmail(recipt: String, subject: String, body: String) {
        val mIntent = Intent(Intent.ACTION_SEND)
        mIntent.data= Uri.parse("mailto:")
        mIntent.type= "text/plain"
        mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(recipt))
        mIntent.putExtra(Intent.EXTRA_SUBJECT ,subject)
        mIntent.putExtra(Intent.EXTRA_TEXT,body)


        try {
            startActivity(Intent.createChooser(mIntent,"choose emailclient.."))

        }
        catch (e:Exception){
            Toast.makeText(this,e.message, Toast.LENGTH_LONG).show()
        }

    }
    fun see(view: View){
        var cd= view as Button
        when(cd.id){
            h6.id->{
                var recipt="naman.nishi@gmail.com"
                var subject="placement request"
                var body="roll no"+ M_id+"has applied for Google Please see his details with college"
                sendEmail(recipt,subject,body)
            }

            bu2.id->{ var intent= Intent(applicationContext,Main6Activity::class.java)
                startActivity(intent)}
    }
}
}
