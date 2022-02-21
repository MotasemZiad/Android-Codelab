package com.example.myfirstapplication

class Manager(id:Int, email:String, phone:Int):Person(id, email,phone) {

    override fun details() {
        super.details()
        println("")
    }
}