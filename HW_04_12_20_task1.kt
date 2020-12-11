package com.example.myapplication

import java.lang.reflect.Type
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

//  Є список, деякі елементи якого повторюються кілька разів. Знайти елемент, який повторюється найчастіше.


fun main(){
    val sizeOfRandomList = 10     // задаємо розмір для randomList
    val firstNumberInRandomList = 0     // задаємо від якої цифри буде генеруватись рандом.
    val secondNumberInRandomList = 10   // задаємо до якої цифри буде генеруватись рандом.
    val randomList = List(sizeOfRandomList) { Random.nextInt(firstNumberInRandomList, secondNumberInRandomList) }
    println("val randomList = $randomList")
    val mutableRandomList : MutableList<Int> = ArrayList()
    mutableRandomList.addAll(randomList)
    println("val mutableRandomList = $mutableRandomList")
    mutableRandomList.sort()
    println("val mutableRandomList after sorting - $mutableRandomList")
    mutableRandomList.mostFrequentEllement()

}

fun MutableList<Int>.mostFrequentEllement() {
    println("Hello from extension for mutableList")
    var temporaryElement = 0

    var mostFrequentElement = this[0]
    var counterOfElemen = 1
    for (i in 0..this.size-1) {
        temporaryElement = this[i]
        println("itteration i = $i")
        var temporaryCounter = 1
        for (j in i+1.. this.size-1 ) {
            println("itteration j = $j")
            if (temporaryElement==(this[j])){
                temporaryCounter++
                if (temporaryCounter>=counterOfElemen){
                    counterOfElemen=temporaryCounter
                    mostFrequentElement=temporaryElement.toInt()
                }
                println("itteration J = $j ,  temporaryElement = $temporaryElement = this[j] =${this[j]} temporaryCounter = $temporaryCounter, counterOfElemen =$counterOfElemen,  mostFrequentElement = $mostFrequentElement")
            }
        }
        if (temporaryCounter==counterOfElemen) {
            println("Two way")


        }
    }
    println("mostFrequentElement = $mostFrequentElement")
}

