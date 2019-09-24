package com.example.myapplication

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val DATABASE_NAME="Apply"
val TABLE_NAME="User"
val C_NAME="name"
val C_cgpa="cgpa"
val c_Id="roll_no"
val accenture="aceenture"
val amazon="amazon"
val google="google"
val tcs="tcs"

class Datas(var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME,null,1) {
    override fun onCreate(db: SQLiteDatabase?){
        val createTable ="CREATE_TABLE"+ TABLE_NAME+"("+ c_Id+"INTEGER PRIMARY KEY AUTOINCREMENT,"+C_NAME+"VARCHAR(256),"+C_cgpa+"DOUBLE," + accenture+"BOLLEAN,"+ google+"BOLLEAN,"+ amazon+"BOLLEAN,"+ tcs+"BOLLEAN)";
        db?.execSQL(createTable)
    }


    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    fun inserData(user : DataB){
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(C_NAME,user.name)
        cv.put(C_cgpa,user.cgpa)
        cv.put(accenture,user.accenture)
        cv.put(google,user.google)
        cv.put(amazon,user.amazon)
        cv.put(tcs,user.tcs)
        var result= db.insert(TABLE_NAME,null,cv)
        if(result==-1.toLong()){
            Toast.makeText(context,"failed",Toast.LENGTH_SHORT).show()


        }
        else
            Toast.makeText(context,"Sucess",Toast.LENGTH_SHORT).show()



    }
}
