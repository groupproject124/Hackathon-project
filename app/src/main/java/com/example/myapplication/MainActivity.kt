package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
    fun cal(view: View){
        val cd= view as ImageButton
        when(cd.id){
            bu1.id->{ var intent= Intent(applicationContext,Main2Activity::class.java)
                startActivity(intent)}
            bu2.id->{ var intent=Intent(applicationContext,Main3Activity::class.java)
                startActivity(intent)}
            bu3.id->{ var intent=Intent(applicationContext,Main4Activity::class.java)
                startActivity(intent)}
            bu4.id->{ var intent=Intent(applicationContext,Main5Activity::class.java)
                startActivity(intent)}

        }
    }

}
