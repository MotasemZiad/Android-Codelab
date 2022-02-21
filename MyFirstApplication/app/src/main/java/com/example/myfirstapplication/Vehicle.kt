package com.example.myfirstapplication

open class Vehicle (var  make:String, var model:String) {

    open fun details(){
        println("This is car $make $model")
    }
}