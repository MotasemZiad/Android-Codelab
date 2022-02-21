package com.example.myfirstapplication

class Student(id:Int, email:String, phone:Int,var college:String, var dept:String):Person(id, email,phone) {
    override fun details() {
        super.details()
    }
}