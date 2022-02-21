package com.example.myfirstapplication

class Car (make:String, model:String, var color:String):Vehicle(make,model) {


    override fun details(){
        super.details()
        println("This is car:\nMake: $make, Model: $model, Color: $color ")
    }

}