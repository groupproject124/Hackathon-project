package com.example.myapplication

class DataB {

        var name:String =""
        var rollno:Int =0
        var cgpa:Double =0.0
        var accenture:Boolean=true
        var amazon:Boolean=true
        var google:Boolean=true
        var tcs:Boolean=true

        constructor(
            rollno:Int,
            name: String,
            cgpa:Double,
            accenture:Boolean,
            google:Boolean,
            amazon:Boolean,
            tcs:Boolean){
            this.name=name
            this.rollno=rollno
            this.cgpa=cgpa
            this.accenture=accenture
            this.amazon=amazon
            this.google=google
            this.tcs=tcs

        }
    constructor(){}
    }
