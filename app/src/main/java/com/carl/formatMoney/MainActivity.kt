package com.carl.formatMoney

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var aaa :String = "aaa"
    var bbb :String = "bbb"
    var dataPost = DataPost()
    var dataPost2 = DataPost()

    var listAAA:MutableList<Int>? = ArrayList()
    var listBBB:MutableList<Int>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun one(){

    }
    
    fun five() {
        Log.e("5", "5")
    }
    fun four(){
        
    }
    fun marge2(){

    }
    fun marge3(){

    }
    fun marge4(){
        
    }
    fun marge5(){
        
    }
}