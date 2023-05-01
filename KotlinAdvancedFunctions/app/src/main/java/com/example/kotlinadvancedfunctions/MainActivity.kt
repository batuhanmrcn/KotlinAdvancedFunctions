package com.example.kotlinadvancedfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    private var myInt : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (myInt != null ){
            val num = myInt!! + 1

        }
        myInt?.let {
            val num = it + 1

        }

        val myNum = myInt?.let {
            it + 1
        } ?: 0

            //also
        val batu = Person("Batuhan",23)
        val mert = Person("Mert",28)
        val irem = Person("İrem",20)

        val people = listOf<Person>(batu,mert,irem)

        val filterPeople = people.filter { it.age > 18 }.also{

            for (person in it){
                println(person.name)
            }

        }

        //Apply

        val intent = Intent()
        intent.putExtra("","")
        intent.putExtra("","")
        intent.`package` = ""

        val intentWithApply = Intent().apply {
            putExtra("","")
            `package`= ""
            action = ""
        }


        //With

        Person("batu",22).apply {
            name = "Batu"

        }.also {
            println(it.name)
        }

        val mercan = Person("Mercan",23).apply {
            name = "Mercan"
        }
        println(mercan.name)

        


    }
}

data class Person (var name : String,val age : Int)