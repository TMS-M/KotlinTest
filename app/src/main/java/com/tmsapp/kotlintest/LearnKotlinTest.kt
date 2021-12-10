package com.tmsapp.kotlintest

import android.util.Log
import kotlin.math.max

/**
 * Created by Android Studio.
 * User: android
 * Date: 2021/12/9
 * Time: 上午 11:34
 */

fun main() {
    val number1 = 120
    val number2 = 150
    val maxNumber = getMaxNumber(number1, number2)
//    println(maxNumber)
//    print(getSorce("Jim"))
//    selectType(10)
//    for (i in 10 downTo   1 step 3){
//        print(i)
//    }
    /*val person = Student("高一","一班","孟宪毓",23)

    person.eat()
    person.readBooks()
    person.doHomeWork()*/
    val cellPhone1= CellPhone("Samsimg",1299.99);
    val cellPhone2= CellPhone("55",1299.99);
    println(cellPhone1)
    println("cellPhone1 equals cellphone2 "+ (cellPhone1==cellPhone2 ))
    Singleton.singletonTest()
}

//    return max(number1,number2)
fun getMaxNumber(number1: Int, number2: Int) = if (number1 < number2) number2 else number1

fun getSorce(name: String) = when  {
    name.startsWith("Tom") -> 100
   name== "Tom" -> 86
    name== "Jim" -> 56
    name==  "TomJack" -> 76
    name==  "Lily" -> 96
    else -> "没有成绩"
}
fun selectType(data:Number) = when(data){
    is Int -> print("data is Int")
    is Double -> print("data is Double")
    is Long -> print("data is Long")
    else -> print("无法识别")
}

