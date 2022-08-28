package com.pr.kotlin_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    var myLiveData=MutableLiveData<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview=findViewById<TextView>(R.id.textview1)

        myLiveData.observe(this,{
            textview.text=it
        })
        myLiveData.value="axax"
    }


}