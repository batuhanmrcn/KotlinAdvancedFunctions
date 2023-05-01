package com.example.kotlinadvancedfunctions

fun main(){

    val myNumList = listOf<Int>(1, 3, 5, 7, 9, 11, 13, 15)

    val allCheck = myNumList.all { it > 5 } // hepsi 5'den büyük mü diye sorar false cevabı verecek
    println(allCheck)

        val anyCheck = myNumList.any { it > 5 } // Herhangi biri 5 ten büyük mü diye sorup true döndürecek.
    println(anyCheck)

    val totalCount = myNumList.count{ it > 5 } //5'ten büyük kaç tane eleman var diye sorar
    println(totalCount)

    val findNum = myNumList.find {  it > 5  } // 5'ten büyük ilk elemanı getirir.
    println(findNum)

    val findLastNum = myNumList.findLast { it > 5 } // 5'ten büyük en büyük sayıyı getirir.
    println(findLastNum)
}