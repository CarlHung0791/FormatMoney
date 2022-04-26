package com.carl.formatMoney

import android.os.Bundle
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

   
}