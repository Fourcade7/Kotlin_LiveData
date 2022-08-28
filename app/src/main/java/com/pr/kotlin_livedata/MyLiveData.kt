package com.pr.kotlin_livedata

import android.util.Log
import androidx.lifecycle.LiveData

class MyLiveData: LiveData<String>() {
     val TAG = "PR7"

    fun setvaluetolivedate(name:String){
        value=name
    }

    override fun onActive() {
        super.onActive()
        Log.d(TAG, "onActive: connect")
    }

    override fun onInactive() {
        super.onInactive()
        Log.d(TAG, "onInactive: disconnect")
    }
}