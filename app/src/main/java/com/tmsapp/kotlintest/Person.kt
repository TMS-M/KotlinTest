package com.tmsapp.kotlintest

/**
 * Created by Android Studio.
 * User: android
 * Date: 2021/12/9
 * Time: 下午 1:39
 */
open class Person(val name:String,val age:Int) {

    fun eat(){
        println(name +" is eating. He1 is "+age+" years old.")
    }
}