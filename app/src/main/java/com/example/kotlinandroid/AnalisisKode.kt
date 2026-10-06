package com.example.kotlinandroid

fun analisisKode(){
    //Soal B1
    val username: String? = null
    val label = username ?: "Guest"
    println(label)

    //Soal B2
    val score = 74
    val grade = when {
        score >= 80 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        else -> "D"
    }
    println(grade)
}