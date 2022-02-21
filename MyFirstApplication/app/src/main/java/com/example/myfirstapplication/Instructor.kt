package com.example.myfirstapplication

class Instructor(id:Int, email:String,phone:Int, var tel:Int, var dept:String):Person(id, email, phone) {

    override fun details() {
        super.details()

    }
}