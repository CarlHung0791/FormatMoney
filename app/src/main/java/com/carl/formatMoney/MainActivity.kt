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

//            Gson().fromJson(intent.extras?.getString(Const.subCategoryBean), CategoryListDataV1::class.java)?.let {
//                ILog.e("it",Gson().toJson(it))
//            }
//            val itemType = object : TypeToken<List<SubCategoryV1>>() {}.type
//            Gson().fromJson<List<SubCategoryV1>>(intent.extras?.getString(Const.subCategoryBean),itemType)?.let {
//                resultVM.categoryResultBean.subCategoryList.value = it
//            }
        aaa = bbb

        bbb = "ccc"

        Log.e("aaa",aaa)
        dataPost.aaa = "aaa"
        dataPost.bbb = "bbb"
        dataPost.list = ArrayList()
        dataPost.list?.add(1)
        dataPost.list?.add(2)
        dataPost.list?.add(3)

        dataPost2.aaa = dataPost.aaa
        dataPost2.bbb = dataPost.bbb
        dataPost2.list = ArrayList()
        dataPost2.list = dataPost.list

        dataPost2.list?.add(11111)

        dataPost2.bbb = "123123"
        Log.e("dataPost2.list", dataPost2.list.toString())
        Log.e("dataPost.list", dataPost.list.toString())


        listAAA?.add(1)
        listAAA?.add(2)
        listAAA?.add(3)

        listBBB = listAAA
        listBBB?.add(1111)
        Log.e("listAAA.list",listAAA.toString())
        Log.e("listBBB.list", listBBB.toString())

    }
}