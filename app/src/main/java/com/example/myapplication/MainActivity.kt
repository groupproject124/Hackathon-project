package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.bu1

class MainActivity : AppCompatActivity() {
    //var dataadd = ArrayList<data>()
    var name=""
    var cgpa=0.0
    var rollno=0





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var context= this
        bu1.setOnClickListener({
            if(tt1.text.toString().length>0&&tt2.text.toString().length>0)
            {var user=DataB(tt2.text.toString().toInt(),tt1.text.toString(),tt3.text.toString().toDouble(),false,false,false,false)
            var db=Datas(context)
                var intent= Intent(applicationContext,Main6Activity::class.java)
                startActivity(intent)


            }
            else{
                Toast.makeText(context,"Please Fill The data",Toast.LENGTH_SHORT)
            }

            tt1.setText("")
            tt2.setText("")
            tt3.setText("")

        })


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
                //tt4.visibility=View.VISIBLE


    fun edit(view:View){
        var cd= view as EditText
        when(cd.id){
            tt1.id ->{tt1.setText("")}
            tt2.id ->{tt2.setText("")}
            tt3.id ->{tt3.setText("")}

        }
    }

}
