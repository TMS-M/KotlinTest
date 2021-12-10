package com.tmsapp.kotlintest

/**
 * Created by Android Studio.
 * User: android
 * Date: 2021/12/9
 * Time: 下午 1:47
 */
class Student(val sno: String, val grade: String, name: String, age: Int) :
    Person(name, age),Study {
    init {
        println(sno)
        println(grade)
    }

    override fun readBooks() {
        println(name+" is reading.")
    }
}